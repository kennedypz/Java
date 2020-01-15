package view;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;

public class Pista extends javax.swing.JFrame {

    public Pista() {
        initComponents();  
    }
    
    public Pista(String carPath){
        initComponents();
        txfInput.requestFocus();
        Poca poca = new Poca(lblPoca, lblCarro, lblScore);
        Thread tPoca = new Thread(poca);
        tPoca.start();
        
        lblCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+carPath)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCarro = new javax.swing.JLabel();
        lblPoca = new javax.swing.JLabel();
        txfInput = new javax.swing.JTextField();
        lblScore = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblEstrada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Need for Desviar das Poças");
        setResizable(false);
        getContentPane().setLayout(null);

        lblCarro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblCarroKeyPressed(evt);
            }
        });
        getContentPane().add(lblCarro);
        lblCarro.setBounds(530, 390, 50, 130);

        lblPoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kisspng-clip-art-puddle-water-drawing-graphics-pixilart-puddle-of-water-by-brightness-5b6422e0e45208.1640322915332891849352.png"))); // NOI18N
        getContentPane().add(lblPoca);
        lblPoca.setBounds(480, -10, 120, 80);

        txfInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfInputKeyPressed(evt);
            }
        });
        getContentPane().add(txfInput);
        txfInput.setBounds(10, 510, 30, 24);

        lblScore.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lblScore.setForeground(new java.awt.Color(0, 0, 0));
        lblScore.setText("0000");
        getContentPane().add(lblScore);
        lblScore.setBounds(40, 40, 50, 30);

        jLabel1.setFont(new java.awt.Font("Ink Free", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Score");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 41, 16);

        lblEstrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estrada.png"))); // NOI18N
        getContentPane().add(lblEstrada);
        lblEstrada.setBounds(0, 0, 980, 550);

        setSize(new java.awt.Dimension(976, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCarroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblCarroKeyPressed
        
    }//GEN-LAST:event_lblCarroKeyPressed

    private void txfInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfInputKeyPressed
        int xCarro = lblCarro.getX();
        int yCarro = lblCarro.getY();
              
        if(evt.getKeyCode() == KeyEvent.VK_LEFT && xCarro == 530) {
            lblCarro.setBounds(xCarro-160, yCarro, lblCarro.getWidth(), lblCarro.getHeight());
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_RIGHT && xCarro == 370) {
            lblCarro.setBounds(xCarro+160, yCarro, lblCarro.getWidth(), lblCarro.getHeight());
        }
    }//GEN-LAST:event_txfInputKeyPressed
    
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
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCarro;
    private javax.swing.JLabel lblEstrada;
    private javax.swing.JLabel lblPoca;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTextField txfInput;
    // End of variables declaration//GEN-END:variables
}
