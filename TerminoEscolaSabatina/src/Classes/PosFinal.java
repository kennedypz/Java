package Classes;

import java.util.Random;
import javax.swing.JLabel;

public class PosFinal {
    String[] mensagens = {
        "\"Guarda o teu pé, quando entrares na casa de Deus; e inclina-te mais a ouvir do que a oferecer sacrifícios de tolos, pois não sabem que fazem mal.\" Eclesiastes 5:1",
        "\"Pelo que, tendo recebido um Reino que não pode ser abalado, retenhamos a graça, pela qual sirvamos a Deus agradavelmente com reverência e piedade;\" Hebreus 12:28",
        "\"Mas O Senhor está no Seu santo templo: cale-se diante dEle toda a terra.\" Habacuque 2:20",
        "\"Na multidão de palavras não falta transgressão, mas o que modera os seus lábios é prudente.\" Provérbios 10:19",
        "Aguardemos com reverência os momentos que se seguem."
    };
    
    public void setImgTxt(JLabel lblBackground, JLabel lblTexto){
        Random rand = new Random();
        
        lblTexto.setText("<html><p>"+mensagens[rand.nextInt(5)]+"</p></html>");
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+Integer.toString(rand.nextInt(3))+".jpg")));
    }
}
