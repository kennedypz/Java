package View;

import Connection.MySql.Dao.ValidaLogin;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ViewLogin extends javax.swing.JFrame {

    public ViewLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txfLogin = new javax.swing.JTextField();
        txfSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        lblLogin.setText("Login");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(40, 140, 25, 14);

        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(40, 170, 34, 14);

        txfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txfLogin);
        txfLogin.setBounds(90, 140, 140, 20);

        txfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSenhaActionPerformed(evt);
            }
        });
        txfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(txfSenha);
        txfSenha.setBounds(90, 170, 140, 20);

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(120, 220, 63, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/3567.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 70, 100);

        setSize(new java.awt.Dimension(318, 344));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSenhaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            ValidaLogin logando = new ValidaLogin();

            if(logando.valida(txfLogin.getText(), txfSenha.getText())){
                ViewPrincipal tela = new ViewPrincipal();
                tela.setVisible(true);
                this.dispose();
            } else{
                JOptionPane.showMessageDialog(rootPane, "Dados incorretos ou usuário não cadastrado.");
            }
        }
    }//GEN-LAST:event_txfSenhaKeyPressed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        ValidaLogin logando = new ValidaLogin();
        
        if(logando.valida(txfLogin.getText(), txfSenha.getText())){
            ViewPrincipal tela = new ViewPrincipal();
            tela.setVisible(true);
            this.dispose();
        } else{
            JOptionPane.showMessageDialog(rootPane, "Dados incorretos ou usuário não cadastrado.");
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfLoginActionPerformed

    private void txfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSenhaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txfLogin;
    private javax.swing.JPasswordField txfSenha;
    // End of variables declaration//GEN-END:variables
}
