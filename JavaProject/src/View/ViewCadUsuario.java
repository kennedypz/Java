
package View;

import Classes.Usuario;
import Connection.MySql.Dao.UsuarioDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewCadUsuario extends javax.swing.JFrame {
    Usuario novoUsuario = new Usuario();
    UsuarioDao dao = new UsuarioDao();
    
    public ViewCadUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txfLogin = new javax.swing.JTextField();
        txfSenha = new javax.swing.JPasswordField();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de usuário");
        setResizable(false);
        getContentPane().setLayout(null);

        lblLogin.setText("Login");
        getContentPane().add(lblLogin);
        lblLogin.setBounds(35, 74, 25, 14);

        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(35, 109, 30, 14);
        getContentPane().add(txfLogin);
        txfLogin.setBounds(120, 70, 180, 20);
        getContentPane().add(txfSenha);
        txfSenha.setBounds(120, 110, 180, 20);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(160, 210, 90, 23);

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 150, 27, 14);

        txfNome = validaCaracteres(60, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        getContentPane().add(txfNome);
        txfNome.setBounds(120, 150, 180, 20);

        setSize(new java.awt.Dimension(424, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        salvarDados();
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadUsuario().setVisible(true);
            }
        });
    }
    
    private boolean validaCamposObrigatorios(){
        return (txfLogin.getText().equals("") || txfSenha.getText().equals(""));
    }
    
    private void limparCampos(){
        txfNome.setText("");
        txfLogin.setText("");
        txfSenha.setText("");
        txfLogin.requestFocus();
    }
    
     private void salvarDados(){
        if(validaCamposObrigatorios()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
        }
        else{
          try{
            novoUsuario.setNome(txfNome.getText().trim());
            novoUsuario.setLogin(txfLogin.getText());
            novoUsuario.setSenha(txfSenha.getText());
            dao.criarRegistroNoDb(novoUsuario);
            limparCampos();
            
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuario\nErro:" + e.toString()); 
            }
        }
    }
     
     public JTextField validaCaracteres(int tamanho,String caracteres) {
        try {
            String quantidade = "";
            for(int i = 0 ; i < tamanho; i++){
                quantidade=quantidade+"*";
            }        
            javax.swing.text.MaskFormatter nome = new javax.swing.text.MaskFormatter(quantidade);
            nome.setValidCharacters(caracteres);

            return new javax.swing.JFormattedTextField(nome);
        }
        catch (Exception e){      
            
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");  
            return new JTextField();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txfLogin;
    private javax.swing.JTextField txfNome;
    private javax.swing.JPasswordField txfSenha;
    // End of variables declaration//GEN-END:variables
}
