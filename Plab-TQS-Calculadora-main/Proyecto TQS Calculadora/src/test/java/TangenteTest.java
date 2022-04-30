import junit.framework.TestCase;
import model.Tangente;
import org.junit.Test;

public class TangenteTest extends TestCase {
    @Test
    public void testConstructor() {
        Tangente x = new Tangente(45);
        assertEquals(45.0,x.getDegree());
        assertEquals(0.0f,x.getValor1());
        assertEquals(0.0f,x.getValor2());
        assertEquals(0.0f,x.getResultado());
    }

    @Test
    public void testConstructorDefecto() {
        Tangente x = new Tangente();
        assertEquals(0.0,x.getDegree());
        assertEquals(0.0f,x.getValor1());
        assertEquals(0.0f,x.getValor2());
        assertEquals(0.0f,x.getResultado());
    }

    //Test interior valor limite frontera
    @Test
    public void testGetter() {
        Tangente x = new Tangente(45);
        x.tangente();
        double resultado = x.getResultadoTangente();
        assertEquals(0.9999999999999999, resultado); //Fa referència a 1
    }

    //Test interior valor limite frontera
    @Test
    public void testTangente() {
        Tangente x = new Tangente(45);
        double resultado = x.tangente();
        assertEquals(0.9999999999999999, resultado); //Fa referència a 1
    }

    //Test interior valor limite frontera
    @Test
    public void testTangenteNegativo() {
        Tangente x = new Tangente(-45); //equivalent a 315
        double resultado = x.tangente();
        assertEquals(-0.9999999999999999, resultado); //Fa referència al -1
    }

    //Test interior valor limite frontera
    @Test
    public void testTangente135() {
        Tangente x = new Tangente(135);
        double resultado = x.tangente();
        assertEquals(-1.0000000000000002, resultado); // -1.0000000000000002 --> Fa referència al -1
    }

    //Test interior valor limite frontera
    @Test
    public void testTangente225() {
        Tangente x = new Tangente(225);
        double resultado = x.tangente();
        assertEquals(0.9999999999999997, resultado); // 0.9999999999999997 --> Fa referència al 1
    }

    //Test interior
    @Test
    public void testTangenteZero() {
        Tangente x = new Tangente(0);
        double resultado = x.tangente();
        assertEquals(0.0, resultado);
    }

    //Test inválido
    @Test
    public void testTangente90() {
        Tangente x = new Tangente(90);
        double resultado = x.tangente();
        assertEquals(1.633123935319537E16, resultado);  //1.633123935319537E16 --> Fa referència al infinit, llavors no es pot calcular
    }

    //Test interior
    @Test
    public void testTangente180() {
        Tangente x = new Tangente(180);
        double resultado = x.tangente();
        assertEquals(-1.2246467991473532E-16, resultado); // -1.2246467991473532E-16 --> Fa referència al valor zero
    }

    //Test inválido
    @Test
    public void testTangente270() {
        Tangente x = new Tangente(270);
        double resultado = x.tangente();
        assertEquals(5.443746451065123E-15, resultado); //5.443746451065123E15 --> Fa referència al menys infinit, llavors no es pot calcular
    }

    //Test interior
    @Test
    public void testTangente360() {
        Tangente x = new Tangente(360);
        double resultado = x.tangente();
        assertEquals(-2.4492935982947064E-16, resultado); //-2.4492935982947064E-16 --> Fa referència a zero.
    }

}