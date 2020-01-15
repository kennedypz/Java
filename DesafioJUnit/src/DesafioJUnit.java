
import java.util.Scanner;

public class DesafioJUnit {
    public String uri1021(double n){
        String retorno = "";
        
        int cem = 0, cinq = 0, vin = 0, dez = 0, cinc = 0, dois = 0, um = 0, mCinq = 0, vinCinc = 0, mDez = 0, mCinc = 0, mUm = 0;

        Scanner input = new Scanner(System.in);

        int valor = (int)n;
        int valorCent = (int)Math.round((n - (int)n) * 100);

        cem = valor/100;
        valor = valor%100;
        
        cinq = valor/50;
        valor = valor%50;

        vin = valor/20;
        valor = valor%20;

        dez = valor/10;
        valor = valor%10;

        cinc = valor/5;
        valor = valor%5;

        dois = valor/2;
        valor = valor%2;

        if (valor == 1){
          valorCent = valorCent + 100;
        }
        
        um = valorCent/100;
        valorCent = valorCent%100;

        mCinq = valorCent/50;
        valorCent = valorCent%50;

        vinCinc = valorCent/25;
        valorCent = valorCent%25;

        mDez = valorCent/10;
        valorCent = valorCent%10;

        mCinc = valorCent/5;
        valorCent = valorCent%5;

        mUm = valorCent;

        retorno = ("NOTAS:\n"+cem+" nota(s) de R$ 100.00\n"+cinq+" nota(s) de R$ 50.00\n"+vin+" nota(s) de R$ 20.00\n"+dez+" nota(s) de R$ 10.00\n"+cinc+" nota(s) de R$ 5.00\n"+dois+" nota(s) de R$ 2.00\nMOEDAS:\n"+um+" moeda(s) de R$ 1.00\n"+mCinq+" moeda(s) de R$ 0.50\n"+vinCinc+" moeda(s) de R$ 0.25\n"+mDez+" moeda(s) de R$ 0.10\n"+mCinc+" moeda(s) de R$ 0.05\n"+mUm+" moeda(s) de R$ 0.01\n");//, cem, cinq, vin, dez, cinc, dois, um, mCinq, vinCinc, mDez, mCinc, mUm);

        input.close();

        
        return retorno;
    }
}
