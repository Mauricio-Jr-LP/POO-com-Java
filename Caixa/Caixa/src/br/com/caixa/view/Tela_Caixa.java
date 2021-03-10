package br.com.caixa.view;

import br.com.caixa.control.CaixaDao;
import br.com.caixa.model.Caixa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */

public class Tela_Caixa extends javax.swing.JFrame 
{
    CaixaDao caixadao = new CaixaDao();
    
    public Tela_Caixa() 
    {
        initComponents();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Caixa = new javax.swing.JLabel();
        Registro = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        Desrição = new javax.swing.JLabel();
        txtDescrição = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        Tipo = new javax.swing.JLabel();
        jRadioButtonEntrada = new javax.swing.JRadioButton();
        jRadioButtonSaida = new javax.swing.JRadioButton();
        Incluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Listar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListagem = new javax.swing.JTextArea();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caixa");
        getContentPane().setLayout(null);

        Caixa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Caixa.setText("Caixa");
        getContentPane().add(Caixa);
        Caixa.setBounds(280, 20, 100, 22);

        Registro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 0, 0));
        Registro.setText("Registro:");
        getContentPane().add(Registro);
        Registro.setBounds(50, 77, 70, 30);

        txtRegistro.setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtRegistro);
        txtRegistro.setBounds(120, 80, 200, 30);

        Desrição.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Desrição.setForeground(new java.awt.Color(255, 0, 0));
        Desrição.setText("Descrição:");
        getContentPane().add(Desrição);
        Desrição.setBounds(50, 120, 70, 30);

        txtDescrição.setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtDescrição);
        txtDescrição.setBounds(120, 120, 200, 30);

        Valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Valor.setForeground(new java.awt.Color(255, 0, 0));
        Valor.setText("Valor:");
        getContentPane().add(Valor);
        Valor.setBounds(50, 157, 60, 30);

        txtValor.setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtValor);
        txtValor.setBounds(120, 160, 200, 30);

        Tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tipo.setForeground(new java.awt.Color(255, 0, 0));
        Tipo.setText("Tipo:");
        getContentPane().add(Tipo);
        Tipo.setBounds(50, 210, 50, 17);

        jRadioButtonEntrada.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButtonEntrada);
        jRadioButtonEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonEntrada.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButtonEntrada.setText("Entrada");
        getContentPane().add(jRadioButtonEntrada);
        jRadioButtonEntrada.setBounds(120, 205, 80, 30);

        jRadioButtonSaida.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButtonSaida);
        jRadioButtonSaida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonSaida.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButtonSaida.setText("Saida");
        getContentPane().add(jRadioButtonSaida);
        jRadioButtonSaida.setBounds(230, 205, 90, 30);

        Incluir.setBackground(new java.awt.Color(0, 0, 0));
        Incluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Incluir.setForeground(new java.awt.Color(255, 0, 0));
        Incluir.setText("Incluir");
        Incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirActionPerformed(evt);
            }
        });
        getContentPane().add(Incluir);
        Incluir.setBounds(120, 250, 200, 30);

        Alterar.setBackground(new java.awt.Color(0, 0, 0));
        Alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Alterar.setForeground(new java.awt.Color(255, 0, 0));
        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });
        getContentPane().add(Alterar);
        Alterar.setBounds(120, 290, 90, 25);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 290, 90, 25);

        Buscar.setBackground(new java.awt.Color(0, 0, 0));
        Buscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 0, 0));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(340, 80, 73, 30);

        Listar.setBackground(new java.awt.Color(0, 0, 0));
        Listar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Listar.setForeground(new java.awt.Color(255, 0, 0));
        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });
        getContentPane().add(Listar);
        Listar.setBounds(430, 80, 65, 30);

        Sair.setBackground(new java.awt.Color(0, 0, 0));
        Sair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sair.setForeground(new java.awt.Color(255, 0, 0));
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(510, 80, 70, 30);

        txtListagem.setBackground(new java.awt.Color(255, 0, 0));
        txtListagem.setColumns(20);
        txtListagem.setRows(5);
        jScrollPane1.setViewportView(txtListagem);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 120, 240, 190);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caixa/view/2222.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, -10, 610, 400);

        setSize(new java.awt.Dimension(618, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncluirActionPerformed
        Caixa caixa = new Caixa();
        int registro = Integer.parseInt(txtRegistro.getText());
        char tipo;
        float valor;
        String descrição = txtDescrição.getText();
        
        if(Integer.parseInt(txtValor.getText())>0) // Valor valido = valor > 0
        {
            if(jRadioButtonEntrada.isSelected())
            {
                valor = Float.parseFloat(txtValor.getText());
                tipo = 'E'; // E = Entrada
            }

            else
            {
                valor = Float.parseFloat(txtValor.getText()) * (-1);
                // Multiplica por -1 para que o valor fique negativo e seja add
                tipo = 'S'; // S = Saída
            }

            //Captura dos valores
            caixa.setRegistro(registro);
            caixa.setDescrição(descrição);
            caixa.setTipo(tipo);
            caixa.setValor(valor);
        
            if(caixadao.incluir(caixa))
                JOptionPane.showMessageDialog(null, "Cadastro realizado");

            else
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar");

            //Limpando caixas de texto
            txtRegistro.setText("");
            txtDescrição.setText("");
            txtValor.setText("");
            jRadioButtonEntrada.setSelected(false);
            jRadioButtonSaida.setSelected(false);
        }
        // Caso digite um valor errado ou seja = valor <= 0
        else
        {
            JOptionPane.showMessageDialog(null, "Valor invalido \nErro");
        }
    }//GEN-LAST:event_IncluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        Caixa caixa = new Caixa();
       
        int registro = Integer.parseInt(txtRegistro.getText());
        String descrição = txtDescrição.getText();
        char tipo;
        float valor;
        
        if (jRadioButtonEntrada.isSelected())
        {
            valor = Float.parseFloat(txtValor.getText());
            tipo = 'E';
        }
        else
        {
            valor = Float.parseFloat(txtValor.getText());
            tipo = 'S';
        }
        caixa.setRegistro(registro);
        caixa.setDescrição(descrição);
        caixa.setValor(valor);
        caixa.setTipo(tipo);
        
        if (caixadao.alterar(caixa))
            JOptionPane.showMessageDialog(null,"Dados Alterados com Sucesso");
        
        else
            JOptionPane.showMessageDialog(null,"Erro em alterar os Dados");
        
        txtRegistro.setText("");
        txtDescrição.setText("");
        txtValor.setText("");
        jRadioButtonEntrada.setSelected(false);
        jRadioButtonSaida.setSelected(false);
    }//GEN-LAST:event_AlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Caixa caixa = new Caixa();
        
        int registro = Integer.parseInt(txtRegistro.getText());
        char tipo;
        float valor = 0;
        String Descrição = txtDescrição.getText();
        
        if(jRadioButtonEntrada.isSelected())
        {
            valor = Float.parseFloat(txtValor.getText());
            tipo = 'E';
        }
        
        else //(jRadioButtonSaida.isSelected())
        {
            valor = Float.parseFloat(txtValor.getText()) * (-1) ;
            tipo = 'S';
        }
        
        caixa.setRegistro(registro);
        caixa.setDescrição(Descrição);
        caixa.setTipo(tipo);
        caixa.setValor(valor);
        
        if(caixadao.excluir(caixa))
            JOptionPane.showMessageDialog(null, "Cadastro excluido");
        
        else
            JOptionPane.showMessageDialog(null, "Falha ao excluir cadastro");
        
        txtRegistro.setText("");
        txtDescrição.setText("");
        txtValor.setText("");
        jRadioButtonEntrada.setSelected(false);
        jRadioButtonSaida.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        int registro = Integer.parseInt(txtRegistro.getText());
        Caixa caixa = caixadao.buscar(registro);
        
        if (caixa!=null)
        {
            JOptionPane.showMessageDialog(null,"Cadastro localizado ");

            txtRegistro.setText("" + caixa.getRegistro());
            txtDescrição.setText(caixa.getDescrição());

            if(caixa.getTipo() == 'E')
            {
                jRadioButtonEntrada.setSelected(true);
                jRadioButtonSaida.setSelected(false);
                txtValor.setText(Float.toString(caixa.getValor() ));
            }
            else
            {
                jRadioButtonEntrada.setSelected(false);
                jRadioButtonSaida.setSelected(true);
                txtValor.setText(Float.toString(caixa.getValor()* (-1)));
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Cadastro não localizado ");
            
            txtDescrição.setText("");
            txtValor.setText("");
            jRadioButtonEntrada.setSelected(false);
            jRadioButtonSaida.setSelected(false);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        txtListagem.setText("");
        txtListagem.setText(listar(caixadao));
    }//GEN-LAST:event_ListarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Caixa().setVisible(true);
            }
        });
    }

    public static String listar(CaixaDao caixalist)
    {
        ArrayList <Caixa> lista = caixalist.lista();
        String texto = "";
        float saldo = 0;
        if(lista.isEmpty()) texto = "Impossível listar";
        
        for(int x = 0; x < lista.size(); x++)
        {
            saldo += lista.get(x).getValor();
            texto += lista.get(x).toString()+ "\n";
        }
        
        texto += "Saldo: R$" +saldo+ "\n_______________________________\n";
        return texto;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Caixa;
    private javax.swing.JLabel Desrição;
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton Incluir;
    private javax.swing.JButton Listar;
    private javax.swing.JLabel Registro;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel Valor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButtonEntrada;
    private javax.swing.JRadioButton jRadioButtonSaida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDescrição;
    private javax.swing.JTextArea txtListagem;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
