package View;

import Classes.Categorias;
import Classes.Produto;
import Connection.MySql.Dao.CategoriaDao;
import Connection.MySql.Dao.ProdutoDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewCadCategoria extends javax.swing.JFrame {
    Categorias novaCategoria = new Categorias();
    CategoriaDao dao = new CategoriaDao();
    
    public ViewCadCategoria() {
            initComponents();
            DefaultTableModel modelo = (DefaultTableModel) tblDados.getModel();
            tblDados.setRowSorter(new TableRowSorter(modelo));
            tblDados.setCellSelectionEnabled(false);
            tblDados.setRowSelectionAllowed(true);
            readJTable();
        }

        public void readJTable() {
            DefaultTableModel modelo = (DefaultTableModel) tblDados.getModel();
            modelo.setNumRows(0);
            CategoriaDao categoriaDao = new CategoriaDao();

            for (Categorias p : categoriaDao.readBd()) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                });
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar categorias");
        setResizable(false);
        getContentPane().setLayout(null);

        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 30, 27, 14);

        txfNome = validaCaracteres(60, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        getContentPane().add(txfNome);
        txfNome.setBounds(70, 30, 166, 20);

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDadosMousePressed(evt);
            }
        });
        tblDados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblDadosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblDados);
        if (tblDados.getColumnModel().getColumnCount() > 0) {
            tblDados.getColumnModel().getColumn(0).setResizable(false);
            tblDados.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 60, 452, 290);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(260, 30, 90, 23);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(430, 30, 63, 23);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(360, 30, 65, 23);

        setSize(new java.awt.Dimension(540, 405));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDadosKeyReleased
      if(tblDados.getSelectedRow() != -1){
            txfNome.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tblDadosKeyReleased

    private void tblDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMousePressed
         if(tblDados.getSelectedRow() != -1){
            txfNome.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_tblDadosMousePressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblDados.getSelectedRow() != -1) {

            try {
                novaCategoria.setId((int) tblDados.getValueAt(tblDados.getSelectedRow(), 0));

                Object[] options = {"Sim", "Não"};
                int n = JOptionPane.showOptionDialog(null,
                        "Deseja exluir a categoria?",
                        "Confirmação de exclusão",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        options,
                        options[1]);

                if (n == 0) {
                    dao.Delete(novaCategoria);
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }

                limparCampos();
                readJTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir.\nErro: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        salvarDados();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
         if (tblDados.getSelectedRow() != -1) {

            int id = (int) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
            try {

                novaCategoria.setId(id);
                novaCategoria.setNome(txfNome.getText().trim());

                dao.Update(novaCategoria);

                limparCampos();

                readJTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma categoria para atualizar");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void limparCampos(){
        txfNome.setText("");
        txfNome.requestFocus();
    }
    
    private boolean validaCamposObrigatorios(){
        return (txfNome.getText().equals(""));
    }
    
    private void salvarDados(){
        if(validaCamposObrigatorios()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }
        else{
          try{
            novaCategoria.setNome(txfNome.getText().trim().toUpperCase());
            dao.criarRegistroNoDb(novaCategoria);
            limparCampos();
            readJTable();
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao registrar o movimento\nErro:" + e.toString()); 
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
            java.util.logging.Logger.getLogger(ViewCadCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txfNome;
    // End of variables declaration//GEN-END:variables
}
