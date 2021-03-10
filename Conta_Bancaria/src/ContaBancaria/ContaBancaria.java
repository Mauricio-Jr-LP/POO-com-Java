package ContaBancaria;

import javax.swing.JOptionPane;

public class ContaBancaria 
{
    public static void main(String[] args)
    {
        programa conta = new programa();
        
        int menu;
        float valor = 0;
        
        do
        {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "1 - Cadastar\n2 - Vizualiza conta\n3 - Depositar\n4 - Sacar"
                + "\n5 - Finaliza sistema"));
            
            switch(menu)
            {
                case 1: conta.cadastrar(); break;
                case 2: JOptionPane.showMessageDialog(null,conta.listar()); 
                break;
                case 3: valor = Float.parseFloat(JOptionPane.showInputDialog
                (null,"Digite o valor:"));
                if(conta.deposito(valor))
                {
                    JOptionPane.showMessageDialog(null,"Deposito efetuado");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Deposito não efetuado");
                }
                break;
                case 4: valor = Float.parseFloat(JOptionPane.showInputDialog
                (null,"Digite o valor:"));
                if(conta.saque(valor))
                {
                    JOptionPane.showMessageDialog(null,"Saque efetuado");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Deposito não efetuado");
                }
                break;
                case 5: JOptionPane.showMessageDialog(null,"Sistema encerrado");
                break;
                default: JOptionPane.showMessageDialog(null,"Comando Invalido");
                break;
            }

        }while(menu != 5);
         
    }
    
}