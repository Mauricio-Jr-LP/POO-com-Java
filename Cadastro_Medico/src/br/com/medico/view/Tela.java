package br.com.medico.view;

import br.com.medico.control.MedicoDao;
import br.com.medico.model.Medico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Tela extends javax.swing.JFrame 
{
    MedicoDao medicodao = new MedicoDao();

    public Tela() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCrm = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEspec = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        Listar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visual = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        confirmarConsuta = new javax.swing.JRadioButton();
        confirmarImposto = new javax.swing.JRadioButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Medico");
        getContentPane().setLayout(null);

        jLabel1.setText("CRM:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 47, 14);

        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 47, 14);

        jLabel3.setText("Especialização:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 90, 14);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar);
        buscar.setBounds(310, 10, 70, 23);

        jLabel4.setText("Valor:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 130, 50, 30);
        getContentPane().add(txtCrm);
        txtCrm.setBounds(80, 10, 190, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(80, 50, 190, 30);
        getContentPane().add(txtEspec);
        txtEspec.setBounds(110, 90, 160, 30);
        getContentPane().add(txtValor);
        txtValor.setBounds(80, 130, 190, 30);

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cadastrar);
        Cadastrar.setBounds(60, 210, 210, 23);

        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });
        getContentPane().add(Listar);
        Listar.setBounds(310, 50, 70, 23);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(430, 10, 70, 23);

        visual.setColumns(20);
        visual.setRows(5);
        jScrollPane1.setViewportView(visual);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 90, 190, 170);

        jLabel5.setText("Pagar:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 170, 60, 14);

        buttonGroup1.add(confirmarConsuta);
        confirmarConsuta.setText("Consulta");
        getContentPane().add(confirmarConsuta);
        confirmarConsuta.setBounds(100, 170, 80, 23);

        buttonGroup1.add(confirmarImposto);
        confirmarImposto.setText("Imposto");
        getContentPane().add(confirmarImposto);
        confirmarImposto.setBounds(200, 170, 80, 23);

        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });
        getContentPane().add(Alterar);
        Alterar.setBounds(60, 240, 90, 23);

        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir);
        Excluir.setBounds(180, 240, 90, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Apresentação2.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 680, 280);

        setSize(new java.awt.Dimension(528, 318));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        Medico medico = new Medico();

        int crm = Integer.parseInt(txtCrm.getText());
        String nome = txtNome.getText();
        String espec = txtEspec.getText();
        char ação;
        float valor;

        if (confirmarConsuta.isSelected())
        {
            valor = Float.parseFloat(txtValor.getText());
            ação = 'C';
        }
        else
        {
            valor = Float.parseFloat(txtValor.getText());
            ação = 'I';
        }
        medico.setCrm(crm);
        medico.setNome(nome);
        medico.setEspecialidade(espec);
        medico.setValor(valor);
        medico.setAção(ação);

        if(medicodao.excluir(medico))
        JOptionPane.showMessageDialog(null, "Cadastro excluido");

        else
        JOptionPane.showMessageDialog(null, "Falha ao excluir cadastro");

        txtCrm.setText("");
        txtNome.setText("");
        txtEspec.setText("");
        txtValor.setText("");
        confirmarConsuta.setSelected(false);
        confirmarImposto.setSelected(false);
    }//GEN-LAST:event_ExcluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        Medico medico = new Medico();

        int crm = Integer.parseInt(txtCrm.getText());
        String nome = txtNome.getText();
        String espec = txtEspec.getText();
        char ação;
        float valor;

        if (confirmarConsuta.isSelected())
        {
            valor = Float.parseFloat(txtValor.getText());
            ação = 'C';
        }
        else
        {
            valor = Float.parseFloat(txtValor.getText());
            ação = 'I';
        }
        medico.setCrm(crm);
        medico.setNome(nome);
        medico.setEspecialidade(espec);
        medico.setValor(valor);
        medico.setAção(ação);

        if (medicodao.alterar(medico))
        JOptionPane.showMessageDialog(null,"Dados Alterados com Sucesso");

        else
        JOptionPane.showMessageDialog(null,"Erro em alterar os Dados");

        txtCrm.setText("");
        txtNome.setText("");
        txtEspec.setText("");
        txtValor.setText("");
        confirmarConsuta.setSelected(false);
        confirmarImposto.setSelected(false);
    }//GEN-LAST:event_AlterarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        visual.setText("");
        visual.setText(listar(medicodao));
    }//GEN-LAST:event_ListarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Medico medico = new Medico();
        int crm = Integer.parseInt(txtCrm.getText());
        char ação;
        float valor;
        String especialidade = txtEspec.getText();
        String nome = txtNome.getText();

        if(Integer.parseInt(txtValor.getText())>0) // Valor valido = valor > 0
        {
            if(confirmarConsuta.isSelected())
            {
                valor = Float.parseFloat(txtValor.getText());
                ação = 'C'; // C = Consuta
            }

            else
            {
                valor = Float.parseFloat(txtValor.getText()) * (-1);
                // Multiplica por -1 para que o valor fique negativo e seja add
                ação = 'I'; // I = Imposto
            }

            //Captura dos valores
            medico.setCrm(crm);
            medico.setNome(nome);
            medico.setEspecialidade(especialidade);
            medico.setAção(ação);
            medico.setValor(valor);

            if(medicodao.cadastrar(medico))
            JOptionPane.showMessageDialog(null, "Cadastro realizado");

            else
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");

            //Limpando caixas de texto
            txtCrm.setText("");
            txtNome.setText("");
            txtEspec.setText("");
            txtValor.setText("");
            confirmarConsuta.setSelected(false);
            confirmarImposto.setSelected(false);
        }
        // Caso digite um valor errado ou seja = valor <= 0
        else
        {
            JOptionPane.showMessageDialog(null, "Valor invalido \nErro");
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        int crm = Integer.parseInt(txtCrm.getText());
        Medico medico = medicodao.buscar(crm);
        
        if (medico!=null)
        {
            JOptionPane.showMessageDialog(null,"Cadastro localizado ");

            txtCrm.setText("" + medico.getCrm());
            txtNome.setText(""+medico.getNome());
            txtEspec.setText(medico.getEspecialidade());

            if(medico.getAção() == 'E')
            {
                confirmarConsuta.setSelected(true);
                confirmarImposto.setSelected(false);
                txtValor.setText(Float.toString(medico.getValor() ));
            }
            else
            {
                confirmarConsuta.setSelected(false);
                confirmarImposto.setSelected(true);
                txtValor.setText(Float.toString(medico.getValor() * (-1)));
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Cadastro não localizado ");
            
            txtCrm.setText("");
            txtNome.setText("");
            txtEspec.setText("");
            txtValor.setText("");
            confirmarConsuta.setSelected(false);
            confirmarImposto.setSelected(false);
        }
    }//GEN-LAST:event_buscarActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
    
    public static String listar(MedicoDao Medicolist)
    {
        ArrayList <Medico> lista = Medicolist.lista();
        String texto = "";
        float receita = 0;
        
        for(int x = 0; x < lista.size(); x++)
        {
            receita += lista.get(x).getValor();
            texto += lista.get(x).toString()+ "\nReceita: R$" +receita+"\n___"
                + "____________________\n";
        }
        
        return texto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Listar;
    private javax.swing.JButton Sair;
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton confirmarConsuta;
    private javax.swing.JRadioButton confirmarImposto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCrm;
    private javax.swing.JTextField txtEspec;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextArea visual;
    // End of variables declaration//GEN-END:variables
}
