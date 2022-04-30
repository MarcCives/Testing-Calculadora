import junit.framework.TestCase;
import model.Cosinus;
import org.junit.Test;

public class CosinusTest extends TestCase {

        @Test
        public void testConstructor() {
            Cosinus x = new Cosinus(45);
            assertEquals(45.0,x.getDegree());
            assertEquals(0.0f,x.getValor1());
            assertEquals(0.0f,x.getValor2());
            assertEquals(0.0f,x.getResultado());
        }

        @Test
        public void testConstructorDefecto() {
            Cosinus x = new Cosinus();
            assertEquals(0.0,x.getDegree());
            assertEquals(0.0f,x.getValor1());
            assertEquals(0.0f,x.getValor2());
            assertEquals(0.0f,x.getResultado());
        }

        //Test interior
        @Test
        public void testCosinus() {
            Cosinus x = new Cosinus(45);
            double resultado = x.cosinus();
            double resultado2 = 0.7071067811865476;
            assertEquals(resultado2, resultado);
        }

        //Test interior
        @Test
        public void testGetter() {
            Cosinus x = new Cosinus(45);
            x.cosinus();
            double resultado = x.getResultadoCosinus();

            assertEquals(0.7071067811865476, resultado);
        }

        //Test interior
        @Test
        public void testCosinusNegativo() {
            Cosinus x = new Cosinus(-45); //equivalente a 315
            double resultado = x.cosinus();
            double resultado2 = 0.7071067811865476;
            assertEquals(resultado2, resultado);
        }

        //Test interior valor limite de frontera
        @Test
        public void testCosinusZero() {
            Cosinus x = new Cosinus(0);
            double resultado = x.cosinus();
            assertEquals(1.0, resultado);
        }

        //Test interior
        @Test
        public void testCosinus90() {
            Cosinus x = new Cosinus(90);
            double resultado = x.cosinus();
            assertEquals(6.123233995736766E-17, resultado); //6.123233995736766E-17 --> representa que es 0
        }

        //Test interior valor limite de frontera
        @Test
        public void testCosinus180() {
            Cosinus x = new Cosinus(180);
            double resultado = x.cosinus();
            assertEquals(-1.0, resultado);
        }

        //Test interior
        @Test
        public void testCosinus270() {
            Cosinus x = new Cosinus(270);
            double resultado = x.cosinus();
            assertEquals(-1.8369701987210297E-16, resultado); //-1.8369701987210297E-16 --> representa valor 0
        }

        //Test interior valor limite de frontera
        @Test
        public void testCosinus360() {
            Cosinus x = new Cosinus(360);
            double resultado = x.cosinus();
            assertEquals(1.0, resultado);
        }
}