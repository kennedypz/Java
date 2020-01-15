package View;

import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class Welcome extends javax.swing.JFrame {
    public int horaFinal = 10, minFinal = 00;
    public int valorFinalSeg = (((horaFinal*3600) + (minFinal*60))/60);
    
    Calendar cal = new GregorianCalendar();
        
    int hora = cal.get(Calendar.HOUR);
    int minuto = cal.get(Calendar.MINUTE);
    int valorAtualSeg = (((hora*3600) + (minuto*60))/60);
    public Welcome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        txfHorario = new javax.swing.JFormattedTextField();
        lblDica = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IASD - Escola Sabatina");
        setResizable(false);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/escola_sabatina1.png"))); // NOI18N

        lblHorario.setText("Horário de encerramento:");

        try {
            txfHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfHorario.setText("10:00");
        txfHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfHorarioKeyPressed(evt);
            }
        });

        lblDica.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        lblDica.setText("*Por padrão o horário de encerramento é às 10:05");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDica)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHorario)
                                .addGap(18, 18, 18)
                                .addComponent(txfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblLogo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorario)
                    .addComponent(txfHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDica)
                .addGap(18, 18, 18)
                .addComponent(btnOk)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(364, 278));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    public void pegaHorario(){
        if(!(txfHorario.getText().equals("  :  "))){
            horaFinal = Integer.parseInt(txfHorario.getText().substring(0, 2));
            minFinal = Integer.parseInt(txfHorario.getText().substring(3, 5));
            
            valorFinalSeg = (((horaFinal*3600) + (minFinal*60))/60);
        }
        if(valorFinalSeg < valorAtualSeg){
            JOptionPane.showMessageDialog(null, "O horário final informado é antes do horário atual.\nPor favor, informe um horário final posterior ou igual ao horário atual.");
        } else{
            PrincipalView telaPrincipal = new PrincipalView(horaFinal, minFinal);
            telaPrincipal.setVisible(true);
            this.dispose();
        }
    }
     
    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        pegaHorario();
    }//GEN-LAST:event_btnOkActionPerformed

    private void txfHorarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfHorarioKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            pegaHorario();
        }
    }//GEN-LAST:event_txfHorarioKeyPressed
    
   
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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel lblDica;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JFormattedTextField txfHorario;
    // End of variables declaration//GEN-END:variables
}
