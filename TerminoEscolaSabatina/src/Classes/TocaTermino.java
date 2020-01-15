package Classes;

import java.io.File;
import javax.swing.JLabel;


public class TocaTermino implements Runnable{
    public TocaTermino(JLabel restam){
        restam.setForeground(new java.awt.Color(255, 0, 0));
    }
    
    @Override
    public void run(){
        String path = "C:\\Users\\paulo\\OneDrive\\Javacodigos\\TerminoEscolaSabatina\\src\\Audio\\termino.mp3";
        File mp3File = new File(path);
        Music2 musica = new Music2();
        musica.tocar(mp3File);
        musica.run();
    }
}
