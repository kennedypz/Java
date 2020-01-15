package view;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Poca implements Runnable{
    JLabel pocaThread;
    JLabel carThread;
    JLabel scoreThread;
    int rand;
    int score;
    
    public Poca(JLabel poca, JLabel carro, JLabel score){
        this.pocaThread = poca;
        this.carThread = carro;
        this.scoreThread = score;
    }
    
    @Override
    public void run() {
        while(true){
            rand = (int) (Math.random()*500+1);
            pocaThread.setBounds(pocaThread.getX(), pocaThread.getY()+60, pocaThread.getWidth(), pocaThread.getHeight());
            
            score = Integer.parseInt(scoreThread.getText());
            score++;
            scoreThread.setText(Integer.toString(score));
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {}
            
            if(pocaThread.getY() >= 440 && pocaThread.getX() == 480){
                pocaThread.setVisible(false);  
                
                try {
                    pocaThread.setBounds(pocaThread.getX()-160, -20, pocaThread.getWidth(), pocaThread.getHeight());
                    Thread.sleep(rand);
                    pocaThread.setVisible(true);
                } catch (InterruptedException ex) {}
            } 
            
            
            if(pocaThread.getY() >= 340 && carThread.getX() == (pocaThread.getX()+50)){
                String[] opcoes = {"Jogar novamente", "Sair"};
                int x = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Game Over!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                
                switch(x){
                    case 0:
                        Escolha escolha = new Escolha();
                        escolha.setVisible(true);
                        break;
                    case 1:
                        System.exit(0);
                }
                break;
            }

            if(pocaThread.getY() >= 440 && pocaThread.getX() == 320){
                pocaThread.setVisible(false);  
                
                try {
                    pocaThread.setBounds(pocaThread.getX()+160, -20, pocaThread.getWidth(), pocaThread.getHeight());
                    Thread.sleep(rand);
                    pocaThread.setVisible(true);
                } catch (InterruptedException ex) {}
            } 
        }
    }
}
