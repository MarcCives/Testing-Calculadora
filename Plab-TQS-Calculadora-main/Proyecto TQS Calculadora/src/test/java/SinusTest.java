import junit.framework.TestCase;
import model.Sinus;
import org.junit.Test;

public class SinusTest extends TestCase {
    @Test
    public void testConstructor() {
        Sinus x = new Sinus(45);
        assertEquals(45.0,x.getDegrees());
        assertEquals(0.0f,x.getValor1());
        assertEquals(0.0f,x.getValor2());
        assertEquals(0.0f,x.getResultado());
    }

    @Test
    public void testConstructorDefecto() {
        Sinus x = new Sinus();
        assertEquals(0.0,x.getDegrees());
        assertEquals(0.0f,x.getValor1());
        assertEquals(0.0f,x.getValor2());
        assertEquals(0.0f,x.getResultado());
    }
    //Test interior
    @Test
    public void testGetter() {
        Sinus x = new Sinus(45);
        x.sinus();
        double resultado = x.getResultadoSinus();
        assertEquals(0.7071067811865475, resultado);
    }

    //Test interior
    @Test
    public void testSinus() {
        Sinus x = new Sinus(45);
        double resultado = x.sinus();
        double resultado2 = 0.7071067811865475;
        assertEquals(resultado2, resultado);
    }

    //Test interior
    @Test
    public void testSinusNegativo() {
        Sinus x = new Sinus(-45); //equivalent a 315
        double resultado = x.sinus();
        double resultado2 = -0.7071067811865475;
        assertEquals(resultado2, resultado);
    }

    //Test interior
    @Test
    public void testSinusZero() {
        Sinus x = new Sinus(0);
        double resultado = x.sinus();
        assertEquals(0.0, resultado);
    }

    //Test interior
    @Test
    public void testSinus360() {
        Sinus x = new Sinus(360);
        double resultado = x.sinus();
        assertEquals(-2.4492935982947064E-16, resultado); // Casi zero --> -2.4492935982947064E-16 representa que es 0
    }

    //Test interior
    @Test
    public void testSinus180() {
        Sinus x = new Sinus(0);
        double resultado = x.sinus();
        assertEquals(0.0, resultado);
    }

    //Test interior valor limite frontera
    @Test
    public void testSinus90() {
        Sinus x = new Sinus(90);
        double resultado = x.sinus();
        assertEquals(1.0, resultado);
    }

    //Test interior valor limite frontera
    @Test
    public void testSinus270() {
        Sinus x = new Sinus(270);
        double resultado = x.sinus();
        assertEquals(-1.0, resultado);
    }
}