package View;

import Classes.Movimento;
import Connection.MySql.Dao.MovimentoDao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Movimentos extends javax.swing.JFrame {
    Movimento novoMovimento = new Movimento();
    MovimentoDao dao = new MovimentoDao();
    
    public Movimentos(){
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel)tblDados.getModel();
        tblDados.setRowSorter(new TableRowSorter(modelo));
        tblDados.setCellSelectionEnabled(false);
        tblDados.setRowSelectionAllowed(true);
        readJTable();
    }
    
        public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) tblDados.getModel();
        modelo.setNumRows(0);
        MovimentoDao dao = new MovimentoDao();
        
        for(Movimento m: dao.readBd()){
            modelo.addRow(new Object[]{
            m.getId(),
            m.getTipo(),
            m.getPreco(),       
            m.getCliente(),
            m.getProduto(),
            m.getData()
            });
        }
    }
        
        public void readJTableCliente(String cliente){
        DefaultTableModel modelo = (DefaultTableModel) tblDados.getModel();
        modelo.setNumRows(0);
        MovimentoDao dao = new MovimentoDao();

        for(Movimento m: dao.buscaCliente(cliente)){
            modelo.addRow(new Object[]{
            m.getId(),
            m.getTipo(),
            m.getPreco(),
            m.getCliente(),
            m.getProduto(),
            m.getData()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTipoMovimento = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        lblPreco = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfProduto = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lblBuscaPorCliente = new javax.swing.JLabel();
        txfBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblTipo = new javax.swing.JLabel();
        txfNomeCliente = new javax.swing.JTextField();
        txfData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txfPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        btnTipoMovimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o tipo", "Compra", "Venda" }));
        getContentPane().add(btnTipoMovimento);
        btnTipoMovimento.setBounds(20, 50, 100, 20);

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Preco", "Cliente", "Produto", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tblDados.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 720, 260);

        lblPreco.setText("Preço");
        getContentPane().add(lblPreco);
        lblPreco.setBounds(140, 30, 27, 14);

        jLabel2.setText("Cliente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 30, 33, 14);

        jLabel3.setText("Produto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 30, 60, 14);

        txfProduto = validaCaracteres(60, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        txfProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfProdutoKeyPressed(evt);
            }
        });
        getContentPane().add(txfProduto);
        txfProduto.setBounds(420, 50, 150, 20);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar);
        btnConfirmar.setBounds(320, 380, 90, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(580, 380, 90, 23);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(680, 380, 61, 23);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(420, 380, 80, 23);

        lblBuscaPorCliente.setText("Buscar por cliente");
        getContentPane().add(lblBuscaPorCliente);
        lblBuscaPorCliente.setBounds(30, 360, 100, 14);

        txfBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfBuscaKeyPressed(evt);
            }
        });
        getContentPane().add(txfBusca);
        txfBusca.setBounds(30, 380, 140, 20);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(180, 380, 65, 23);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(510, 380, 63, 23);

        lblTipo.setText("Tipo");
        getContentPane().add(lblTipo);
        lblTipo.setBounds(20, 30, 20, 14);

        txfNomeCliente = validaCaracteres(60, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        getContentPane().add(txfNomeCliente);
        txfNomeCliente.setBounds(240, 50, 150, 20);

        txfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDataActionPerformed(evt);
            }
        });
        getContentPane().add(txfData);
        txfData.setBounds(590, 50, 140, 20);

        jLabel1.setText("Data");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 30, 23, 14);
        getContentPane().add(txfPreco);
        txfPreco.setBounds(140, 50, 80, 20);

        setSize(new java.awt.Dimension(780, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
       salvarDados();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        ViewPrincipal tela = new ViewPrincipal();
        tela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       if (tblDados.getSelectedRow() != -1) {

            int id = (int) tblDados.getValueAt(tblDados.getSelectedRow(), 0);
            try {

                novoMovimento.setId(id);
                novoMovimento.setTipo(btnTipoMovimento.getSelectedItem().toString());
                novoMovimento.setPreco(txfPreco.getText());
                novoMovimento.setCliente(txfNomeCliente.getText());
                novoMovimento.setProduto(txfProduto.getText());
                novoMovimento.setData(txfData.getText());
                dao.Update(novoMovimento);

                limparCampos();

                readJTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar" + e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um movimento para atualizar");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblDadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDadosKeyReleased
        if(tblDados.getSelectedRow() != -1){
            btnTipoMovimento.setSelectedItem(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfPreco.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
            txfNomeCliente.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 3).toString());
            txfProduto.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 4).toString());
            txfData.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tblDadosKeyReleased

    private void tblDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMousePressed
           if(tblDados.getSelectedRow() != -1){
            btnTipoMovimento.setSelectedItem(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfPreco.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
            txfNomeCliente.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 3).toString());
            txfProduto.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 4).toString());
            txfData.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tblDadosMousePressed
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       readJTableCliente(txfBusca.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txfProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfProdutoKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            salvarDados();
        }
    }//GEN-LAST:event_txfProdutoKeyPressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(tblDados.getSelectedRow() != -1){
            
            try{
                novoMovimento.setId((int)tblDados.getValueAt(tblDados.getSelectedRow(), 0));
                
                Object[] options = {"Sim", "Não"};
                int n = JOptionPane.showOptionDialog(null,
                "Deseja exluir o movimento?",
                "Confirmação de exclusão",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                options,
                options[1]);
                
                if(n == 0){
                    dao.Delete(novoMovimento);
                } else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }
               
                limparCampos();
                readJTable();
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Erro ao excluir.\nErro: " + e.toString()); 
                }
        } else{
            JOptionPane.showMessageDialog(null, "Selecione um movimento para excluir!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDataActionPerformed
        
    }//GEN-LAST:event_txfDataActionPerformed

    private void txfBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            readJTableCliente(txfBusca.getText());
        }
    }//GEN-LAST:event_txfBuscaKeyPressed

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
            java.util.logging.Logger.getLogger(Movimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movimentos().setVisible(true);
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
        return (txfPreco.getText().equals("") || txfNomeCliente.getText().equals("") || txfProduto.getText().equals("") || btnTipoMovimento.getSelectedItem().toString().equals("Selecione o tipo"));
    }
    
    private void limparCampos(){
        txfPreco.setText("");
        txfNomeCliente.setText("");
        txfProduto.setText("");
        txfPreco.requestFocus();
    }
    
    private String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
}
    
    private void salvarDados(){
        if(validaCamposObrigatorios()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }
        else{
          try{
            novoMovimento.setTipo(btnTipoMovimento.getSelectedItem().toString());
            novoMovimento.setPreco(txfPreco.getText());
            novoMovimento.setCliente(txfNomeCliente.getText().trim().toUpperCase());
            novoMovimento.setProduto(txfProduto.getText().trim().toUpperCase());
            novoMovimento.setData(getDateTime());
            dao.criarRegistroNoDb(novoMovimento);
            limparCampos();
            readJTable();
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao registrar o movimento\nErro:" + e.toString()); 
            }
        }
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox btnTipoMovimento;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscaPorCliente;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txfBusca;
    private javax.swing.JTextField txfData;
    private javax.swing.JTextField txfNomeCliente;
    private javax.swing.JTextField txfPreco;
    private javax.swing.JTextField txfProduto;
    // End of variables declaration//GEN-END:variables
}
