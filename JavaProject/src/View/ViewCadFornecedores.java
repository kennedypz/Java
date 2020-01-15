package View;

import Classes.Fornecedor;
import Connection.MySql.Dao.FornecedorDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewCadFornecedores extends javax.swing.JFrame {
    Fornecedor novoFornecedor = new Fornecedor();
    FornecedorDao dao = new FornecedorDao();

    public ViewCadFornecedores() {
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
            FornecedorDao fornecedorDao = new FornecedorDao();

            for (Fornecedor p : fornecedorDao.readBd()) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getEmpresa(),
                    p.getProduto(),
                    p.getPreco(),
                });
            }
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmpresa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txfEmpresa = new javax.swing.JTextField();
        txfProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txfPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lblEmpresa.setText("Empresa");
        getContentPane().add(lblEmpresa);
        lblEmpresa.setBounds(40, 40, 60, 14);

        jLabel1.setText("Produto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 40, 50, 14);

        txfEmpresa = validaCaracteres(60, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        getContentPane().add(txfEmpresa);
        txfEmpresa.setBounds(40, 60, 240, 20);

        txfProduto = validaCaracteres(60, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        getContentPane().add(txfProduto);
        txfProduto.setBounds(320, 60, 210, 20);

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Empresa", "Produto", "Preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            tblDados.getColumnModel().getColumn(2).setResizable(false);
            tblDados.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 720, 230);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(340, 350, 63, 23);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(410, 350, 80, 23);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(500, 350, 63, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(570, 350, 90, 23);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(670, 350, 61, 23);

        jLabel2.setText("Preco");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 40, 34, 14);
        getContentPane().add(txfPreco);
        txfPreco.setBounds(560, 60, 130, 20);

        setSize(new java.awt.Dimension(775, 447));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDadosKeyReleased
       if(tblDados.getSelectedRow() != -1){
            txfEmpresa.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfProduto.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
            txfPreco.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_tblDadosKeyReleased

    private void tblDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMousePressed
        if(tblDados.getSelectedRow() != -1){
            txfEmpresa.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfProduto.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
            txfPreco.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_tblDadosMousePressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       salvarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if (tblDados.getSelectedRow() != -1) {
            try {
                novoFornecedor.setId((int) tblDados.getValueAt(tblDados.getSelectedRow(), 0));

                Object[] options = {"Sim", "Não"};
                int n = JOptionPane.showOptionDialog(null,
                        "Deseja exluir o fornecedor?",
                        "Confirmação de exclusão",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        options,
                        options[1]);

                if (n == 0) {
                    dao.Delete(novoFornecedor);
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }

                limparCampos();
                readJTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir.\nErro: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um fornecedor para excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
         if (tblDados.getSelectedRow() != -1) {

            int id = (int) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
            try {

                novoFornecedor.setId(id);
                novoFornecedor.setEmpresa(txfEmpresa.getText().trim());
                novoFornecedor.setProduto(txfProduto.getText().trim());
                novoFornecedor.setPreco(txfPreco.getText().trim());

                dao.Update(novoFornecedor);

                limparCampos();

                readJTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um fornecedor para atualizar");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadFornecedores().setVisible(true);
            }
        });
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
    
    private boolean validaCamposObrigatorios(){
        return (txfEmpresa.getText().equals("") || txfProduto.getText().equals(""));
    }
    
    private void limparCampos(){
        txfEmpresa.setText("");
        txfProduto.setText("");
        txfEmpresa.requestFocus();
    }
    
    private void salvarDados(){
        if(validaCamposObrigatorios()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }
        else{
          try{
            novoFornecedor.setEmpresa(txfEmpresa.getText().trim().toUpperCase());
            novoFornecedor.setProduto(txfProduto.getText().trim().toUpperCase());
            novoFornecedor.setPreco(txfPreco.getText().trim());
            dao.criarRegistroNoDb(novoFornecedor);
            limparCampos();
            readJTable();
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao registrar o movimento\nErro:" + e.toString()); 
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txfEmpresa;
    private javax.swing.JTextField txfPreco;
    private javax.swing.JTextField txfProduto;
    // End of variables declaration//GEN-END:variables
}
