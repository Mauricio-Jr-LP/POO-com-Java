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
        jLabelRgistro = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JTextField();
        jLabelDescrição = new javax.swing.JLabel();
        txtDescrição = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jRadioButtonEntrada = new javax.swing.JRadioButton();
        jRadioButtonSaida = new javax.swing.JRadioButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonIncluir = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        ButtonListar = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        ButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListagem = new javax.swing.JTextArea();
        Titulos = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caixa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabelRgistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRgistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRgistro.setText("Registro");
        getContentPane().add(jLabelRgistro);
        jLabelRgistro.setBounds(20, 70, 60, 30);
        getContentPane().add(txtRegistro);
        txtRegistro.setBounds(90, 70, 210, 30);

        jLabelDescrição.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescrição.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescrição.setText("Descrição");
        getContentPane().add(jLabelDescrição);
        jLabelDescrição.setBounds(20, 110, 60, 30);
        getContentPane().add(txtDescrição);
        txtDescrição.setBounds(90, 110, 210, 30);

        jLabelValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor");
        getContentPane().add(jLabelValor);
        jLabelValor.setBounds(20, 150, 60, 30);
        getContentPane().add(txtValor);
        txtValor.setBounds(90, 150, 210, 30);

        jLabelTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo");
        getContentPane().add(jLabelTipo);
        jLabelTipo.setBounds(20, 190, 60, 40);

        buttonGroup1.add(jRadioButtonEntrada);
        jRadioButtonEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonEntrada.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonEntrada.setText("Entrada");
        getContentPane().add(jRadioButtonEntrada);
        jRadioButtonEntrada.setBounds(90, 200, 90, 25);

        buttonGroup1.add(jRadioButtonSaida);
        jRadioButtonSaida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButtonSaida.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonSaida.setText("Saida");
        getContentPane().add(jRadioButtonSaida);
        jRadioButtonSaida.setBounds(210, 200, 90, 25);

        ButtonAlterar.setText("Alterar");
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAlterar);
        ButtonAlterar.setBounds(90, 290, 90, 23);

        ButtonIncluir.setText("Incluir");
        ButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIncluirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonIncluir);
        ButtonIncluir.setBounds(90, 240, 210, 40);

        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonExcluir);
        ButtonExcluir.setBounds(210, 290, 90, 23);

        ButtonListar.setText("Listar");
        ButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonListarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonListar);
        ButtonListar.setBounds(420, 70, 59, 23);

        ButtonSair.setText("Sair");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonSair);
        ButtonSair.setBounds(490, 70, 51, 23);

        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonBuscar);
        ButtonBuscar.setBounds(330, 70, 70, 23);

        txtListagem.setColumns(20);
        txtListagem.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        txtListagem.setRows(5);
        jScrollPane1.setViewportView(txtListagem);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 110, 210, 210);

        Titulos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulos.setForeground(new java.awt.Color(255, 255, 255));
        Titulos.setText("Caixa");
        getContentPane().add(Titulos);
        Titulos.setBounds(270, 10, 42, 22);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/caixa/view/2222.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 680, 350);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 40, 73, 23);

        setSize(new java.awt.Dimension(589, 387));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIncluirActionPerformed
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
    }//GEN-LAST:event_ButtonIncluirActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
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
    }//GEN-LAST:event_ButtonBuscarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
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
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
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
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonListarActionPerformed
        txtListagem.setText("");
        txtListagem.setText(listar(caixadao));
    }//GEN-LAST:event_ButtonListarActionPerformed

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed
        System.exit(0); // Fechar programa
    }//GEN-LAST:event_ButtonSairActionPerformed

    
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
        
        texto += "Saldo: R$" +saldo+ "\n_________\n";
        return texto;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonIncluir;
    private javax.swing.JButton ButtonListar;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Titulos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDescrição;
    private javax.swing.JLabel jLabelRgistro;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JRadioButton jRadioButtonEntrada;
    private javax.swing.JRadioButton jRadioButtonSaida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDescrição;
    private javax.swing.JTextArea txtListagem;
    private javax.swing.JTextField txtRegistro;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}