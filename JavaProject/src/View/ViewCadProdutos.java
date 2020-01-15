package View;

import Classes.Produto;
import Connection.MySql.Dao.ProdutoDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewCadProdutos extends javax.swing.JFrame {

    Produto novoProduto = new Produto();
    ProdutoDao dao = new ProdutoDao();

    public ViewCadProdutos() {
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
        ProdutoDao produtoDao = new ProdutoDao();

        for (Produto p : produtoDao.readBd()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getPreco(),
                p.getQuantidade(),
                p.getCategoria(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblCamposObrigatorios = new javax.swing.JLabel();
        btnCategoria = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txfPreco = new javax.swing.JTextField();
        txfNome = new javax.swing.JTextField();
        txfQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD - Produtos");
        setPreferredSize(new java.awt.Dimension(796, 405));
        setResizable(false);
        getContentPane().setLayout(null);

        lblNome.setForeground(new java.awt.Color(255, 0, 0));
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 40, 33, 16);

        lblPreco.setForeground(new java.awt.Color(255, 0, 0));
        lblPreco.setText("Preço");
        getContentPane().add(lblPreco);
        lblPreco.setBounds(290, 40, 34, 16);

        lblQuantidade.setForeground(new java.awt.Color(255, 0, 0));
        lblQuantidade.setText("Quantidade");
        getContentPane().add(lblQuantidade);
        lblQuantidade.setBounds(380, 40, 60, 16);

        lblCategoria.setForeground(new java.awt.Color(255, 0, 0));
        lblCategoria.setText("Categoria");
        getContentPane().add(lblCategoria);
        lblCategoria.setBounds(500, 40, 50, 16);

        lblCamposObrigatorios.setForeground(new java.awt.Color(255, 0, 0));
        lblCamposObrigatorios.setText("*Os campos em vermelho são obrigatórios*");
        getContentPane().add(lblCamposObrigatorios);
        lblCamposObrigatorios.setBounds(20, 10, 220, 16);

        btnCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione a categoria", "Enlatados", "Massas", "Limpeza", "Perecíveis", "Higiene Pessoal" }));
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategoria);
        btnCategoria.setBounds(500, 60, 140, 26);

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Preco", "Quantidade", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            tblDados.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 760, 220);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(400, 360, 66, 32);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(480, 360, 80, 32);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(580, 360, 69, 32);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(670, 360, 80, 32);
        getContentPane().add(txfPreco);
        txfPreco.setBounds(290, 60, 70, 24);

        txfNome = validaCaracteres(60, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        getContentPane().add(txfNome);
        txfNome.setBounds(20, 60, 220, 24);
        getContentPane().add(txfQuantidade);
        txfQuantidade.setBounds(380, 60, 60, 24);

        setSize(new java.awt.Dimension(812, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDadosKeyReleased
        if (tblDados.getSelectedRow() != -1) {
            txfNome.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfPreco.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
            txfQuantidade.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 3).toString());
            btnCategoria.setSelectedItem(tblDados.getValueAt(tblDados.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tblDadosKeyReleased

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed

    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void tblDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMousePressed
        if (tblDados.getSelectedRow() != -1) {
            txfNome.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfPreco.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
            txfQuantidade.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 3).toString());
            btnCategoria.setSelectedItem(tblDados.getValueAt(tblDados.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_tblDadosMousePressed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tblDados.getSelectedRow() != -1) {

            try {
                novoProduto.setId((int) tblDados.getValueAt(tblDados.getSelectedRow(), 0));

                Object[] options = {"Sim", "Não"};
                int n = JOptionPane.showOptionDialog(null,
                        "Deseja exluir o cadastro?",
                        "Confirmação de exclusão",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        options,
                        options[1]);

                if (n == 0) {
                    dao.Delete(novoProduto);
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }

                limparCampos();
                readJTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir.\nErro: " + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para atualizar!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (tblDados.getSelectedRow() != -1) {

            int id = (int) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
            try {

                novoProduto.setId(id);
                novoProduto.setNome(txfNome.getText().trim());
                novoProduto.setPreco(txfPreco.getText());
                novoProduto.setQuantidade(Integer.parseInt(txfQuantidade.getText()));
                novoProduto.setCategoria(btnCategoria.getSelectedItem().toString());

                dao.Update(novoProduto);

                limparCampos();

                readJTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para atualizar");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadProdutos().setVisible(true);
            }
        });
    }

    public JTextField validaCaracteres(int tamanho, String caracteres) {
        try {
            //defino a variável que vai guardar a quantidade de caracteres
            String quantidade = "";

            //defino um método de repetição para repetir o numero de
            //vezes  do tamanho
            for (int i = 0; i < tamanho; i++) {
                // defino asterisco para aceitar qualquer coisa e crio a máscara
                quantidade = quantidade + "*";
            }
            //  **********...   de acordo com o tamanho informado
            // defino que a mascara possui essa
            //quantidade de elementos que foi informado em tamanho e
            // foi colocada com * dentro de quantidade
            javax.swing.text.MaskFormatter nome = new javax.swing.text.MaskFormatter(quantidade);

            //defino que o parâmetro caracter recebido pelo
            //método contém os caracteres válidos 
            nome.setValidCharacters(caracteres);

            //retorno a mascara que foi criada  
            return new javax.swing.JFormattedTextField(nome);
        }// fim do try
        catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
            //retorno um campo de texto comum  
            return new JTextField();
        }
    }

    private boolean validaCamposObrigatorios() {
        return (txfNome.getText().equals("") || txfPreco.getText().equals("") || txfQuantidade.getText().equals("") || btnCategoria.getSelectedItem().equals("Selecione a categoria"));
    }

    private void limparCampos() {
        txfNome.setText("");
        txfPreco.setText("");
        txfQuantidade.setText("");
        btnCategoria.setSelectedItem("Selecione uma categoria");
        txfNome.requestFocus();
    }

    private void salvarDados() {
        if (validaCamposObrigatorios()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        } else {
            try {
                novoProduto.setNome(txfNome.getText().trim().toUpperCase());
                novoProduto.setPreco(txfPreco.getText().toUpperCase());
                novoProduto.setQuantidade(Integer.parseInt(txfQuantidade.getText()));
                novoProduto.setCategoria(btnCategoria.getSelectedItem().toString());
                dao.criarRegistroNoDb(novoProduto);
                limparCampos();
                readJTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente\nErro:" + e.toString());
            }
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox btnCategoria;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCamposObrigatorios;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txfNome;
    private javax.swing.JTextField txfPreco;
    private javax.swing.JTextField txfQuantidade;
    // End of variables declaration//GEN-END:variables
}
