import junit.framework.TestCase;
import model.Exponente;
import org.junit.Test;

public class ExponenteTest extends TestCase {

    @Test
    public void testConstructorDef() {
        Exponente ex = new Exponente();

        assertEquals(0.0f, ex.getEx());
        assertEquals(0.0f, ex.getValor1());
        assertEquals(0.0f, ex.getValor2());
        assertEquals(0.0f, ex.getResultado());
    }

    @Test
    public void testConstructorPar() {
        Exponente ex = new Exponente(3);

        assertEquals(3.0f, ex.getEx());
        assertEquals(0.0f, ex.getValor1());
        assertEquals(0.0f, ex.getValor2());
        assertEquals(0.0f, ex.getResultado());
    }

    //Test interior                                             //2.7182817 = valor exponent (e)
    @Test
    public void testExponente() {
        Exponente ex = new Exponente(1);

        assertEquals(2.7182817f, ex.exponente());
        assertEquals(2.7182817f, ex.getResultado());
    }

    //Test interior
    @Test
    public void testExponenteZero() {
        Exponente ex = new Exponente(0);

        assertEquals(1.0f, ex.exponente());
        assertEquals(1.0f, ex.getResultado());
    }

    //Test interior de frontera
    @Test
    public void testExponenteLimitePositivo() {
        Exponente ex = new Exponente(0.1f);

        assertEquals(1.105171f, ex.exponente());
        assertEquals(1.105171f, ex.getResultado());
    }

    //Test interior de frontera
    @Test
    public void testExponenteLimiteNegativo() {
        Exponente ex = new Exponente(-0.1f);

        assertEquals(0.9048374f, ex.exponente());
        assertEquals(0.9048374f, ex.getResultado());
    }

    //Test interior
    @Test
    public void testExponenteNegativo() {
        Exponente ex = new Exponente(-5f);

        assertEquals(0.006737947f, ex.exponente());
        assertEquals(0.006737947f, ex.getResultado());
    }

    //Test interior
    @Test
    public void testExponenteInfinty() {
        Exponente x = new Exponente(500);
        float resultado = x.exponente();
        boolean comp;

        if (resultado > Integer.MAX_VALUE) //valor infinit = infinty, Integer.MAX_VALUE representa el valor màxim d'integer que accepta el programa
            comp = true;
        else
            comp = false;

        assertTrue(comp);

    }
}