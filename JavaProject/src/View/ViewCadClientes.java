package View;

import Classes.Pessoa;
import Connection.MySql.Dao.PessoaDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewCadClientes extends javax.swing.JFrame {
    Pessoa novaPessoa = new Pessoa();
    PessoaDao pessoaDao = new PessoaDao();

    public ViewCadClientes(){
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
        PessoaDao clienteDao = new PessoaDao();
        
        for(Pessoa p: clienteDao.readBd()){
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

        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTipoPessoa = new javax.swing.JLabel();
        txfEmail = new javax.swing.JTextField();
        txfTelefone = new javax.swing.JFormattedTextField();
        txfCelular = new javax.swing.JFormattedTextField();
        txfEndereco = validaCaracteres(120, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        txfEndereco = new javax.swing.JTextField();
        btnTipoPessoa = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        txfNome = new javax.swing.JTextField();
        txfTipoPessoa = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD - Clientes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setForeground(new java.awt.Color(255, 0, 0));
        lblNome.setText("Nome ");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, -1));

        lblEmail.setText("Email");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblTelefone.setText("Telefone");
        getContentPane().add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        lblCelular.setForeground(new java.awt.Color(255, 0, 0));
        lblCelular.setText("Celular");
        getContentPane().add(lblCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        lblEndereco.setText("Endereço");
        getContentPane().add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        lblTipoPessoa.setForeground(new java.awt.Color(255, 0, 0));
        lblTipoPessoa.setText("Tipo de pessoa");
        getContentPane().add(lblTipoPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));
        getContentPane().add(txfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, -1));

        try {
            txfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 90, -1));

        try {
            txfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 90, -1));

        txfEndereco.setToolTipText("");
        txfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 360, -1));

        btnTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "CPF", "CNPJ" }));
        btnTipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTipoPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 73, -1));

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*Os campos em vermelho são obrigatórios*");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, -1));

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Email", "Telefone", "Celular", "Endereco", "Tipo de pessoa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jScrollPane2.setViewportView(tblDados);
        if (tblDados.getColumnModel().getColumnCount() > 0) {
            tblDados.getColumnModel().getColumn(0).setResizable(false);
            tblDados.getColumnModel().getColumn(1).setResizable(false);
            tblDados.getColumnModel().getColumn(2).setResizable(false);
            tblDados.getColumnModel().getColumn(3).setResizable(false);
            tblDados.getColumnModel().getColumn(4).setResizable(false);
            tblDados.getColumnModel().getColumn(5).setResizable(false);
            tblDados.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 750, 190));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        txfNome = validaCaracteres(60, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZçÇéáíúóÁÉÓÍÚãõÃÕ ");
        getContentPane().add(txfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 240, -1));

        try {
            txfTipoPessoa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfTipoPessoa.setToolTipText("CPF ou CNPJ (apenas números)");
        txfTipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTipoPessoaActionPerformed(evt);
            }
        });
        getContentPane().add(txfTipoPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 130, -1));

        setSize(new java.awt.Dimension(812, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTelefoneActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnTipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTipoPessoaActionPerformed

    private void tblDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMousePressed
         if(tblDados.getSelectedRow() != -1){
            txfNome.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfEmail.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
            txfTelefone.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 3).toString());
            txfCelular.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 4).toString());
            txfEndereco.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 5).toString());
            txfTipoPessoa.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tblDadosMousePressed

    private void tblDadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDadosKeyReleased
        if(tblDados.getSelectedRow() != -1){
            txfNome.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 1).toString());
            txfEmail.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 2).toString());
            txfTelefone.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 3).toString());
            txfCelular.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 4).toString());
            txfEndereco.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 5).toString());
            txfTipoPessoa.setText(tblDados.getValueAt(tblDados.getSelectedRow(), 6).toString());
        }
    }//GEN-LAST:event_tblDadosKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if(tblDados.getSelectedRow() != -1){
            
            int id = (int)tblDados.getValueAt(tblDados.getSelectedRow(), 0);
            try{
                
                novaPessoa.setId(id);
                novaPessoa.setNome(txfNome.getText().trim());
                novaPessoa.setEmail(txfEmail.getText());
                novaPessoa.setTelefone(txfTelefone.getText());
                novaPessoa.setCelular(txfCelular.getText());
                novaPessoa.setEndereco(txfEndereco.getText());
                novaPessoa.setTipoPessoa(txfTipoPessoa.getText());
                
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

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tblDados.getSelectedRow() != -1){
            
            try{
                novaPessoa.setId((int)tblDados.getValueAt(tblDados.getSelectedRow(), 0));
                
                Object[] options = {"Sim", "Não"};
                int n = JOptionPane.showOptionDialog(null,
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
                  JOptionPane.showMessageDialog(null, "Erro ao Excluir.\nErro: " + e.toString()); 
                }
        } else{
            JOptionPane.showMessageDialog(null, "Selecione um cliente para atualizar!");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txfTipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTipoPessoaActionPerformed
    
    }//GEN-LAST:event_txfTipoPessoaActionPerformed

    private void txfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfEnderecoActionPerformed
 
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadClientes().setVisible(true);
            }
        });
    }
    
    public JTextField validaCaracteres(int tamanho,String caracteres) {
        try {
            //defino a variável que vai guardar a quantidade de caracteres
            String quantidade = "";

            //defino um método de repetição para repetir o numero de
            //vezes  do tamanho
            for(int i = 0 ; i < tamanho; i++){
                // defino asterisco para aceitar qualquer coisa e crio a máscara
                quantidade=quantidade+"*";
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
        catch (Exception e){      
            
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
            //retorno um campo de texto comum  
            return new JTextField();
        }
    }
    
    private boolean validaCamposObrigatorios(){
        return (txfNome.getText().equals("") || txfCelular.getText().equals("") || txfTipoPessoa.getText().equals("") || btnTipoPessoa.getSelectedItem().equals("Selecione"));
    }
    
    private void limparCampos(){
        txfNome.setText("");
        txfEmail.setText("");
        txfTelefone.setText("");
        txfCelular.setText("");
        txfTipoPessoa.setText("");
        txfEndereco.setText("");
        txfNome.requestFocus();
    }
    
    private void salvarDados(){
        if(validaCamposObrigatorios()){
           JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }
        else{
          try{
            novaPessoa.setNome(txfNome.getText().trim().toUpperCase());
            novaPessoa.setEmail(txfEmail.getText().toUpperCase());
            novaPessoa.setTelefone(txfTelefone.getText());
            novaPessoa.setCelular(txfCelular.getText());
            novaPessoa.setTipoPessoa(btnTipoPessoa.getSelectedItem().toString() +": "+ txfTipoPessoa.getText());
            novaPessoa.setEndereco(txfEndereco.getText());
            pessoaDao.criarRegistroNoDb(novaPessoa);
            limparCampos();
            readJTable();
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, "Erro ao cadastrar o cliente\nErro:" + e.toString()); 
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox btnTipoPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipoPessoa;
    private javax.swing.JTable tblDados;
    private javax.swing.JFormattedTextField txfCelular;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfEndereco;
    private javax.swing.JTextField txfNome;
    private javax.swing.JFormattedTextField txfTelefone;
    private javax.swing.JFormattedTextField txfTipoPessoa;
    // End of variables declaration//GEN-END:variables
}
