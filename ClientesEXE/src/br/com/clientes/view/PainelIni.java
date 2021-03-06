/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clientes.view;

import javax.swing.JOptionPane;

/**
 *
 * @author 312162007
 */
public class PainelIni extends javax.swing.JFrame {

    /**
     * Creates new form PainelIni
     */
    public PainelIni() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLabel();
        Options = new javax.swing.JMenuBar();
        movimentações = new javax.swing.JMenu();
        opcMovimentacoes = new javax.swing.JMenuItem();
        opcSobre = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SONGE SISTEMS");
        setMinimumSize(new java.awt.Dimension(526, 374));
        setPreferredSize(new java.awt.Dimension(526, 374));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clientes/view/ori.png"))); // NOI18N
        bg.setMaximumSize(new java.awt.Dimension(526, 374));
        bg.setMinimumSize(new java.awt.Dimension(526, 374));
        bg.setPreferredSize(new java.awt.Dimension(526, 374));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, 960, 570));

        movimentações.setText("Opções");

        opcMovimentacoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        opcMovimentacoes.setText("Movimentações");
        opcMovimentacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcMovimentacoesActionPerformed(evt);
            }
        });
        movimentações.add(opcMovimentacoes);

        opcSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_HOME, 0));
        opcSobre.setText("Sobre");
        opcSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcSobreActionPerformed(evt);
            }
        });
        movimentações.add(opcSobre);

        Options.add(movimentações);

        sair.setText("Sair");
        sair.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                sairMenuSelected(evt);
            }
        });
        Options.add(sair);

        setJMenuBar(Options);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_sairMenuSelected
        JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO!","Sair", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_sairMenuSelected

    private void opcMovimentacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcMovimentacoesActionPerformed
        new Cadastro().setVisible(true);
    }//GEN-LAST:event_opcMovimentacoesActionPerformed

    private void opcSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcSobreActionPerformed
        JOptionPane.showMessageDialog(null, "DESENVOLVIDO PELOS MELHORES GAROTOS DE PROGRAMA DE FEIRA DE SANTANA:\nADENILSON JAMERSON & GEOVANE RODRIGUES","Sobre", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_opcSobreActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PainelIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelIni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelIni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Options;
    private javax.swing.JLabel bg;
    private javax.swing.JMenu movimentações;
    private javax.swing.JMenuItem opcMovimentacoes;
    private javax.swing.JMenuItem opcSobre;
    private javax.swing.JMenu sair;
    // End of variables declaration//GEN-END:variables
}
