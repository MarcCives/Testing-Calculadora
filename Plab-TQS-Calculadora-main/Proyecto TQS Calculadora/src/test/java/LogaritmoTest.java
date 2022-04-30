import junit.framework.TestCase;
import model.Logaritmo;
import org.junit.Test;

public class LogaritmoTest extends TestCase {

    @Test
    public void testConstructorLog() {

        Logaritmo l = new Logaritmo();
        double resultado2 = l.getLog();
        double value1 = l.getValor1();
        double value2 = l.getValor2();
        double result = l.getResultado();

        assertEquals( 0.0, resultado2);
        assertEquals(0.0, value1);
        assertEquals(0.0, value2);
        assertEquals(0.0, result);
    }

    @Test
    public void testConstructorParamLog() {
        Logaritmo l = new Logaritmo(5);
        double resultado2 = l.getLog();
        double value1 = l.getValor1();
        double value2 = l.getValor2();
        double result = l.getResultadoLog();

        assertEquals(5.0, resultado2);
        assertEquals(0.0, value1);
        assertEquals(0.0, value2);
        assertEquals(0.0, result);
    }

    // Test interior
    @Test
    public void testLogaritmoPositivo() {

        Logaritmo l = new Logaritmo(10);

        double resultado2 = l.logaritmo();
        double result = l.getResultadoLog();

        assertEquals(1.0, resultado2);
        assertEquals(1.0, result);
    }
    //Funció on comprovem que NaN != NaN per saber que es un valor null
    static public boolean isNaN(double v) {
        return (v != v);
    }

    //Test exterior/invàlid
    @Test
    public void testLogaritmoNegativo() {

        Logaritmo l = new Logaritmo(-10);

        double resultado2 = l.logaritmo();
        double result = l.getResultadoLog();

        assertTrue(isNaN(resultado2)); //Comprovació de que el resultat es null amb la funció declarada anteriorment
    }


    // Test interior de frontera limite
    @Test
    public void testLogaritmoLimiteInterior() {

        Logaritmo l = new Logaritmo(0.1f);

        double resultado2 = l.logaritmo();
        double result = l.getResultadoLog();

        assertEquals(-0.999999993528508, resultado2); // Fa referència al -1
        assertEquals(-0.999999993528508, result); // Fa referència al -1
    }

    // Test exterior de frontera limite
    @Test
    public void testLogaritmoLimiteExterior() {

        Logaritmo l = new Logaritmo(-0.1f);

        double resultado2 = l.logaritmo();
        double result = l.getResultadoLog();

        assertTrue(isNaN(resultado2)); //Comprovació de que el resultat es null amb la funció declarada anteriorment isNaN()
    }
}