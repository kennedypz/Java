import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DesafioJUnitTest {
    
    public DesafioJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test(timeout = 1000)
    public void testUri1021() {
        System.out.println("uri1021");
        double n = 576.73;
        DesafioJUnit instance = new DesafioJUnit();
        String expResult = "NOTAS:\n" +
            "5 nota(s) de R$ 100.00\n" +
            "1 nota(s) de R$ 50.00\n" +
            "1 nota(s) de R$ 20.00\n" +
            "0 nota(s) de R$ 10.00\n" +
            "1 nota(s) de R$ 5.00\n" +
            "0 nota(s) de R$ 2.00\n" +
            "MOEDAS:\n" +
            "1 moeda(s) de R$ 1.00\n" +
            "1 moeda(s) de R$ 0.50\n" +
            "0 moeda(s) de R$ 0.25\n" +
            "2 moeda(s) de R$ 0.10\n" +
            "0 moeda(s) de R$ 0.05\n" +
            "3 moeda(s) de R$ 0.01\n";
        String result = instance.uri1021(n);
        assertEquals(expResult, result);
        
        n = 91.01;
        expResult = "NOTAS:\n" +
            "0 nota(s) de R$ 100.00\n" +
            "1 nota(s) de R$ 50.00\n" +
            "2 nota(s) de R$ 20.00\n" +
            "0 nota(s) de R$ 10.00\n" +
            "0 nota(s) de R$ 5.00\n" +
            "0 nota(s) de R$ 2.00\n" +
            "MOEDAS:\n" +
            "1 moeda(s) de R$ 1.00\n" +
            "0 moeda(s) de R$ 0.50\n" +
            "0 moeda(s) de R$ 0.25\n" +
            "0 moeda(s) de R$ 0.10\n" +
            "0 moeda(s) de R$ 0.05\n" +
            "1 moeda(s) de R$ 0.01\n";
        result = instance.uri1021(91.01);
        assertEquals(expResult, result);
        
        n = 4.00;
        expResult = "NOTAS:\n" +
            "0 nota(s) de R$ 100.00\n" +
            "0 nota(s) de R$ 50.00\n" +
            "0 nota(s) de R$ 20.00\n" +
            "0 nota(s) de R$ 10.00\n" +
            "0 nota(s) de R$ 5.00\n" +
            "2 nota(s) de R$ 2.00\n" +
            "MOEDAS:\n" +
            "0 moeda(s) de R$ 1.00\n" +
            "0 moeda(s) de R$ 0.50\n" +
            "0 moeda(s) de R$ 0.25\n" +
            "0 moeda(s) de R$ 0.10\n" +
            "0 moeda(s) de R$ 0.05\n" +
            "0 moeda(s) de R$ 0.01\n";
        result = instance.uri1021(4.00);
        assertEquals(expResult, result);
    }
    
}
