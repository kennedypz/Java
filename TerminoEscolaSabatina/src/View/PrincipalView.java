package View;

import Classes.TocaTermino;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrincipalView extends javax.swing.JFrame {
    int horaFinal;
    int minFinal;
    
    public PrincipalView(int horaFinal, int minFinal) {
        this.horaFinal = horaFinal;
        this.minFinal = minFinal;
        initComponents();
        new Thread(){
            @Override
            public void run(){
                for(;;){
                    dataEHora();
                    try{
                        sleep(1000);
                    }catch(InterruptedException ie){
                        ie.printStackTrace();
                    }
                }
            }
        }.start();
    }
    
    public void dataEHora(){
        String h, m, s;
        Calendar cal = new GregorianCalendar();
        
        int hora = cal.get(Calendar.HOUR);
        int minuto = cal.get(Calendar.MINUTE);
        int segundo = cal.get(Calendar.SECOND);
        tocaFinal(hora, minuto, segundo);
        
        h = String.format("%02d", hora);
        m = String.format("%02d", minuto);
        s = String.format("%02d", segundo);
        
        lblHora.setText(h+":"+m+":"+s);
        int restamMin = ((minFinal*60) - (minuto*60))/60;
        lblRestam.setText(Integer.toString(restamMin)+" min");
    }
    
    public void tocaFinal(int h, int m, int s){
        if(h == horaFinal && m == minFinal && s == 00){
            TocaTermino termino = new TocaTermino(lblRestam);
            Thread tTermino = new Thread(termino);
            tTermino.start();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHora = new javax.swing.JLabel();
        lblRestam = new javax.swing.JLabel();
        lblNomeHora = new javax.swing.JLabel();
        lblNomeRestam = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronômetro Escola Sabatina");
        setResizable(false);
        getContentPane().setLayout(null);

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        getContentPane().add(lblHora);
        lblHora.setBounds(590, 140, 340, 110);

        lblRestam.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        getContentPane().add(lblRestam);
        lblRestam.setBounds(760, 340, 210, 60);

        lblNomeHora.setFont(new java.awt.Font("Tahoma", 1, 72)); // NOI18N
        lblNomeHora.setText("Hora");
        getContentPane().add(lblNomeHora);
        lblNomeHora.setBounds(680, 60, 180, 80);

        lblNomeRestam.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        lblNomeRestam.setText("Restam");
        getContentPane().add(lblNomeRestam);
        lblNomeRestam.setBounds(520, 340, 230, 60);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Escola-sabatina-1024x691.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 1040, 650);

        setSize(new java.awt.Dimension(1024, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//Comentei porque coloquei parametros para o construtor e apareceu erro aqui
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PrincipalView().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNomeHora;
    private javax.swing.JLabel lblNomeRestam;
    private javax.swing.JLabel lblRestam;
    // End of variables declaration//GEN-END:variables
}
