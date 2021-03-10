package View;

import Modell.Conta;
import Controll.Conta_Controll;
import javax.swing.JOptionPane;

public class Conta_View 
{
    public static void main(String [] args)
    {
        Conta c = new Conta();
        Conta_Controll cc = new Conta_Controll();
        
        int menu;
        float valor = 0;
        
        do
        {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1 - Cadastrar\n2 - Visualiza conta\n3 - Depositar"
                    + "\n4 - Sacar\n5 - Finalizar sistema"));
            
            switch(menu)
            {
                case 1: int conta;
                conta = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Digite o numero da conta: "));
                String nome = JOptionPane.showInputDialog(null, "Digite o nome"
                    + " do responsavel da conta: ");
                
                c.setConta(conta);
                c.setNome(nome);
                c.setSaldo(0);
                cc.cadastar(c);
                break;
                
                case 2: c = cc.listar();
                JOptionPane.showMessageDialog(null, 
                    "\nNumero da conta: "+c.getConta()+
                    "\nNome do usuario: "+c.getNome()+
                    "\nSaldo: "+c.getSaldo());
                break;
                
                case 3: valor = Float.parseFloat(JOptionPane.showInputDialog
                    (null, "Digite o valor:"));
                if(cc.depositar(valor))
                    JOptionPane.showMessageDialog(null,"Deposito com sucesso");
                else
                    JOptionPane.showMessageDialog(null,"Deposito não realizado");
                break;
                
                case 4: valor = Float.parseFloat(JOptionPane.showInputDialog
                    (null, "Digite o valor:"));
                if(cc.depositar(valor))
                    JOptionPane.showMessageDialog
                    (null,"Saque feito com sucesso");
                else
                    JOptionPane.showMessageDialog(null,"Saque não realizado");
                break;
                
                case 5:  JOptionPane.showMessageDialog
                    (null, "Sistema encerrado");
                break;
                default:  JOptionPane.showMessageDialog
                    (null, "Comando invalido");
                break;
            }
        }while(menu != 5);
    }   
}
