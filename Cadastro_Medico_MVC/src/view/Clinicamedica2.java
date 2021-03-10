package view;

import controll.MedicoDao;
import javax.swing.JOptionPane;
import modell.Medico;

public class Clinicamedica2 
{
    public static void main(String[] args) 
    {
        Medico medico = new Medico();
        MedicoDao medicoDao = new MedicoDao();
        
        int menu;
        float valor;
        
        do
        {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,
                "*****Sistema da clinica*****"
                + "\n1- Cadastrar \n2- Listar "
                + "\n3- Faturar consuta\n4- Pagar impostos"
                + "\n5- Sair do sistema"));
            
            switch (menu)
            {
                case 1: int crm = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o CRM do medico"));
                String nome = JOptionPane.showInputDialog(null,"Digite o nome");
                String especialidade = JOptionPane.showInputDialog(null,
                    "Digite a especialização");
                
                medico.setCrm(crm);
                medico.setNome(nome);
                medico.setEspecialidade(especialidade);
                medico.setReceita(0);
                medicoDao.cadastrar(medico);
                
                JOptionPane.showMessageDialog(null, "Medico cadastrado");
                break;
                
                case 2:medico = medicoDao.listar();
                JOptionPane.showMessageDialog(null,"CRM:\n" +medico.getCrm()+ 
               "\nNome:\n" +medico.getNome()+ 
               "\nEspecialização:\n"+medico.getEspecialidade()+
               "\nInvestimento:\nR$" +medico.getReceita());
                break;
                
                case 3:
                    valor = Float.parseFloat(JOptionPane.showInputDialog(null, 
                        "Digite o valor da consuta"));
                    if(medicoDao.faturar(valor))
                        JOptionPane.showMessageDialog(null,"Consuta sucesso");
                    else
                        JOptionPane.showMessageDialog(null,"erro");
                    break;
                case 4:
                    valor = Float.parseFloat(JOptionPane.showInputDialog(null,
                        "Digite o valor dos impostos"));
                    if (medicoDao.pagarImpostos(valor))
                       JOptionPane.showMessageDialog(null, "Imposto pago");
                    else
                        JOptionPane.showMessageDialog(null, "Imposto não pago");
                    break;
                case 5: JOptionPane.showMessageDialog(null,"Sistema encerrado");
                break;
                default: JOptionPane.showMessageDialog(null,"Opção invalida");
            }
        }while(menu != 5);
    }
}   