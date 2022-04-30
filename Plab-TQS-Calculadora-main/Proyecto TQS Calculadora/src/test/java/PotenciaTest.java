import junit.framework.TestCase;
import model.Potencia;
import org.junit.Test;


public class PotenciaTest extends TestCase {


    @Test
    public void testConstructor() {
        Potencia x = new Potencia(5,2);
        assertEquals(5.0f,x.getValor1());
        assertEquals(2.0f,x.getValor2());
    }

    public void testConstructorDefecto() {
        Potencia x = new Potencia();
        assertEquals(0.0f, x.getValor1());
        assertEquals(0.0f, x.getValor2());
        assertEquals(0.0f,x.getResultado());
    }

    //Test interior
    @Test
    public void testExponenteBasico()
    {
        Potencia x = new Potencia(5,3);
        float resultado = x.potencia();
        assertEquals(125.0f, resultado);
    }

    //Test interior
    @Test
    public void testExponenteNegativo() {
        Potencia x = new Potencia(5,-2);
        float resultado = x.potencia();
        assertEquals(0.04f, resultado);
    }

    //Test interior
    @Test
    public void testExponenteZero() {
        Potencia x = new Potencia(5,0);
        float resultado = x.potencia();
        assertEquals(1.0f,resultado);
    }

    //Test interior
    @Test
    public void testNumZero() {
        Potencia x = new Potencia(0, 7);
        float resultado = x.potencia();
        assertEquals(0.0f, resultado);
    }


    //Test interior
    @Test
    public void testExponenteDecimal() {
        Potencia x = new Potencia(2, 0.1f);
        float resultado = x.potencia();
        assertEquals(1.0717734f, resultado);
    }

    //Test interior
    @Test
    public void testExponenteInfinty() {
        Potencia x = new Potencia(12,500);
        float resultado = x.potencia();
        boolean comp;

        if (resultado > Integer.MAX_VALUE) //valor infinito = infinty, Integer.MAX_VALUE representa el valor màxim d'integer que accepta el programa
            comp = true;
        else
            comp = false;
        
        assertTrue(comp);

    }

}