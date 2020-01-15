package View;

public class ViewPrincipal extends javax.swing.JFrame {

    public ViewPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuClientes = new javax.swing.JMenu();
        MiCrudClientes = new javax.swing.JMenuItem();
        MenuProdutos = new javax.swing.JMenu();
        MiCrudProdutos = new javax.swing.JMenuItem();
        MiMovimentos = new javax.swing.JMenuItem();
        MiCategorias = new javax.swing.JMenuItem();
        MenuFornecedores = new javax.swing.JMenu();
        miCrudFornecedores = new javax.swing.JMenuItem();
        MenuUsuarios = new javax.swing.JMenu();
        miCrudUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(null);

        MenuClientes.setText("Clientes");

        MiCrudClientes.setText("CRUD");
        MiCrudClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiCrudClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(MiCrudClientes);

        jMenuBar1.add(MenuClientes);

        MenuProdutos.setText("Produtos");
        MenuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProdutosActionPerformed(evt);
            }
        });

        MiCrudProdutos.setText("CRUD");
        MiCrudProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiCrudProdutosActionPerformed(evt);
            }
        });
        MenuProdutos.add(MiCrudProdutos);

        MiMovimentos.setText("Movimentos");
        MiMovimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiMovimentosActionPerformed(evt);
            }
        });
        MenuProdutos.add(MiMovimentos);

        MiCategorias.setText("Categorias");
        MiCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiCategoriasActionPerformed(evt);
            }
        });
        MenuProdutos.add(MiCategorias);

        jMenuBar1.add(MenuProdutos);

        MenuFornecedores.setText("Fornecedores");

        miCrudFornecedores.setText("CRUD");
        miCrudFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrudFornecedoresActionPerformed(evt);
            }
        });
        MenuFornecedores.add(miCrudFornecedores);

        jMenuBar1.add(MenuFornecedores);

        MenuUsuarios.setText("Usuários");

        miCrudUsuarios.setText("CRUD");
        miCrudUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCrudUsuariosActionPerformed(evt);
            }
        });
        MenuUsuarios.add(miCrudUsuarios);

        jMenuBar1.add(MenuUsuarios);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(742, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MiCrudClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCrudClientesActionPerformed
        ViewCadClientes tela = new ViewCadClientes();
        tela.setVisible(true);
    }//GEN-LAST:event_MiCrudClientesActionPerformed

    private void MiCrudProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCrudProdutosActionPerformed
        ViewCadProdutos tela = new ViewCadProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_MiCrudProdutosActionPerformed

    private void MiMovimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiMovimentosActionPerformed
        Movimentos tela = new Movimentos();
        tela.setVisible(true);
    }//GEN-LAST:event_MiMovimentosActionPerformed

    private void MenuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProdutosActionPerformed
        ViewCadCategoria tela = new ViewCadCategoria();
        tela.setVisible(true);
        
    }//GEN-LAST:event_MenuProdutosActionPerformed

    private void MiCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCategoriasActionPerformed
        ViewCadCategoria tela = new ViewCadCategoria();
        tela.setVisible(true);
    }//GEN-LAST:event_MiCategoriasActionPerformed

    private void miCrudFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrudFornecedoresActionPerformed
        ViewCadFornecedores tela = new ViewCadFornecedores();
        tela.setVisible(true);
    }//GEN-LAST:event_miCrudFornecedoresActionPerformed

    private void miCrudUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCrudUsuariosActionPerformed
       ViewCadUsuario tela = new ViewCadUsuario();
       tela.setVisible(true);
    }//GEN-LAST:event_miCrudUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuFornecedores;
    private javax.swing.JMenu MenuProdutos;
    private javax.swing.JMenu MenuUsuarios;
    private javax.swing.JMenuItem MiCategorias;
    private javax.swing.JMenuItem MiCrudClientes;
    private javax.swing.JMenuItem MiCrudProdutos;
    private javax.swing.JMenuItem MiMovimentos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miCrudFornecedores;
    private javax.swing.JMenuItem miCrudUsuarios;
    // End of variables declaration//GEN-END:variables
}
