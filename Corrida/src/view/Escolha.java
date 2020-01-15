package view;

public class Escolha extends javax.swing.JFrame {

    public Escolha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBmw = new javax.swing.JLabel();
        lblCorvette = new javax.swing.JLabel();
        lblMustang = new javax.swing.JLabel();
        lblPorsche = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Need for Desviar das Poças");
        setResizable(false);
        getContentPane().setLayout(null);

        lblBmw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bmw.jpg"))); // NOI18N
        lblBmw.setBorder(new javax.swing.border.MatteBorder(null));
        lblBmw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBmwMouseClicked(evt);
            }
        });
        getContentPane().add(lblBmw);
        lblBmw.setBounds(20, 70, 190, 290);

        lblCorvette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/corvette.jpg"))); // NOI18N
        lblCorvette.setBorder(new javax.swing.border.MatteBorder(null));
        lblCorvette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCorvetteMouseClicked(evt);
            }
        });
        getContentPane().add(lblCorvette);
        lblCorvette.setBounds(240, 70, 170, 290);

        lblMustang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mustang.jpg"))); // NOI18N
        lblMustang.setBorder(new javax.swing.border.MatteBorder(null));
        lblMustang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMustangMouseClicked(evt);
            }
        });
        getContentPane().add(lblMustang);
        lblMustang.setBounds(430, 70, 160, 290);

        lblPorsche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/porsche.jpg"))); // NOI18N
        lblPorsche.setBorder(new javax.swing.border.MatteBorder(null));
        lblPorsche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPorscheMouseClicked(evt);
            }
        });
        getContentPane().add(lblPorsche);
        lblPorsche.setBounds(620, 70, 150, 290);

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        jLabel1.setText("Escolha seu carro");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 20, 200, 30);

        setSize(new java.awt.Dimension(812, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblBmwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBmwMouseClicked
        Pista jogo = new Pista("bmwCarro.jpg");
        jogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBmwMouseClicked

    private void lblCorvetteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCorvetteMouseClicked
        Pista jogo = new Pista("corvetteCarro.png");
        jogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCorvetteMouseClicked

    private void lblMustangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMustangMouseClicked
        Pista jogo = new Pista("mustangCarro.png");
        jogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMustangMouseClicked

    private void lblPorscheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPorscheMouseClicked
        Pista jogo = new Pista("porscheCarro.png");
        jogo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblPorscheMouseClicked

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
            java.util.logging.Logger.getLogger(Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escolha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escolha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBmw;
    private javax.swing.JLabel lblCorvette;
    private javax.swing.JLabel lblMustang;
    private javax.swing.JLabel lblPorsche;
    // End of variables declaration//GEN-END:variables
}
