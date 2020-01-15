package Classes;

import View.PosFinalView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music2 {
    private File mp3;
    private Player player;
 
    public void tocar(File mp3) {
	this.mp3 = mp3;
    }
 
    public void run() {
	try{
            FileInputStream fis = new FileInputStream(mp3);
            BufferedInputStream bis = new BufferedInputStream(fis);
            this.player = new Player(bis);
            this.player.play();
            
	} catch (Exception e) {
            
            System.out.println("Erro ao tocar Musica" + mp3);
            e.printStackTrace();
	}
        PosFinalView tela = new PosFinalView();
        tela.setVisible(true);
    }
}

