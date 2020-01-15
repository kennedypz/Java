package View;

import Classes.Pessoa;
import Connection.MySql.Dao.PessoaDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewTeste extends javax.swing.JFrame {

    Pessoa novaPessoa = new Pessoa();
    PessoaDao pessoaDao = new PessoaDao();
    
    public ViewTeste(){
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel)tblDados.getModel();
        tblDados.setRowSorter(new TableRowSorter(modelo));
        tblDados.setCellSelectionEnabled(false); //este comando e o da próxima linha servem para poder selecionar a linha toda,
        tblDados.setRowSelectionAllowed(true);
        readJTable();
    }
    
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) tblDados.getModel();
        modelo.setNumRows(0);
        Pessoa clienteDao = new Pessoa();
        
        for(Pessoa p: pessoaDao.readBd()){
            modelo.addRow(new Object[]{
            p.getId(),
            p.getNome(),
            p.getEmail(),
            p.getTelefone(),
            p.getCelular(),
            p.getEndereco(),
            p.getTipoPessoa()
            });
        }
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblEndreco = new javax.swing.JLabel();
        lblTipoPessoa = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        txfEmail = new javax.swing.JTextField();
        txfTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View para testes");
        setResizable(false);

        lblNome.setText("Nome");

        lblEmail.setText("email");

        lblTelefone.setText("telefone");

        lblCelular.setText("celular");

        lblEndreco.setText("endereco");

        lblTipoPessoa.setText("tipo pessoa");

        txfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEmailActionPerformed(evt);
            }
        });

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nome", "email", "telefone", "celular", "endereco", "tipopessoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
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
            tblDados.getColumnModel().getColumn(6).setResizable(false);
        }

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar)
                    .addComponent(jButton1)
                    .addComponent(lblEndreco)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblTipoPessoa)
                        .addComponent(lblCelular)
                        .addComponent(lblTelefone)
                        .addComponent(lblEmail)
                        .addComponent(lblNome)
                        .addComponent(txfNome)
                        .addComponent(txfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(txfTelefone)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblNome)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail)
                        .addGap(4, 4, 4)
                        .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblCelular)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEndreco)
                        .addGap(2, 2, 2)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTipoPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEmailActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tblDados.getSelectedRow() != -1){
            
            try{
                //novaPessoa.setId((int)TblDados.getValueAt(TblDados.getSelectedRow(), 0)); a linha de baixo deve ser assim
                novaPessoa.setId((int)tblDados.getValueAt(tblDados.getSelectedRow(), 0));
                
                Object[] options = {"Sim", "Não"};
                int n = JOptionPane.showOptionDialog(null,//parent container of JOptionPane
                "Deseja exluir o cadastro?",
                "Confirmação de exclusão",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,//do not use a custom Icon
                options,//the titles of buttons
                options[1]);//default button title
                
                if(n == 0){
                    pessoaDao.Delete(novaPessoa);
                } else{
                    JOptionPane.showMessageDialog(null, "Operação cancelada");
                }
               
                limparCampos();
                readJTable();
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Erro ao atualizar.\n" + e.toString()); 
                }
        } else{
            JOptionPane.showMessageDialog(null, "Selecione um cliente para atualizar!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        salvarDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
         if(tblDados.getSelectedRow() != -1){
            
            int id = (int)tblDados.getValueAt(tblDados.getSelectedRow(), 0);
            try{
                
                novaPessoa.setId(id);
                novaPessoa.setNome(txfNome.getText().trim());
                novaPessoa.setEmail(txfEmail.getText());
                novaPessoa.setTelefone(txfTelefone.getText());
                pessoaDao.Update(novaPessoa);
                
                limparCampos();

                readJTable();
              }catch(SQLException e){
                  JOptionPane.showMessageDialog(null, "Erro ao atualizar" + e.toString()); 
                }
        } else{
            JOptionPane.showMessageDialog(null, "Selecione um cliente para atualizar");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tblDadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDadosKeyReleased
        if(tblDados.getSelectedRow() != -1){
            txfNome.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 0).toString());
            txfEmail.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfTelefone.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tblDadosKeyReleased

    private void tblDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMousePressed
        if(tblDados.getSelectedRow() != -1){
            txfNome.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 0).toString());
            txfEmail.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfTelefone.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tblDadosMousePressed
    private void limparCampos(){
        txfNome.setText("");
        txfEmail.setText("");
        txfTelefone.setText("");
        txfNome.requestFocus(); //Redefine o foco pro campo de nome
    }
    
    private boolean validaCamposObrigatorios(){
        return (txfNome.getText().equals("") || txfEmail.getText().equals("") || txfTelefone.getText().equals(""));
    }
    
    private void salvarDados(){
        /*A fução de validação dos campos retorna true se os campos estiverem vazios,
        *portanto há uma mensagem de erro pois os campos devem ser preenchidos.
        *
        *caso a função retorne false significa que os campos estão preenchidos
        *e que os valores podem ser salvos.
        */
        if(validaCamposObrigatorios()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios");
        }
        else{
          try{
            novaPessoa.setNome(txfNome.getText().trim());
            novaPessoa.setEmail(txfEmail.getText());
            novaPessoa.setTelefone(txfTelefone.getText());
            pessoaDao.criarRegistroNoDb(novaPessoa);
            limparCampos();
            
            readJTable();
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao salvar." + e.toString()); 
            }
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
            java.util.logging.Logger.getLogger(ViewTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndreco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipoPessoa;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfNome;
    private javax.swing.JFormattedTextField txfTelefone;
    // End of variables declaration//GEN-END:variables
}
