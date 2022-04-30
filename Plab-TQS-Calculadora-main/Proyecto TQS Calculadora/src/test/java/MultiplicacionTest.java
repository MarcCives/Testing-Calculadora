import junit.framework.TestCase;
import model.Multiplicacion;
import org.junit.Test;

public class MultiplicacionTest extends TestCase {

  @Test
  public void testConstructorDefecto() {
    Multiplicacion x = new Multiplicacion();
    assertEquals(0.0f, x.getValor1());
    assertEquals(0.0f, x.getValor2());
    assertEquals(0.0f, x.getResultado());
  }

  @Test
  public void testConstructorMultiplicacion() {
    float x = 2.2f;
    float y = 3.7f;

    Multiplicacion mult = new Multiplicacion(x,y);

    assertEquals(x, mult.getValor1());
    assertEquals(y, mult.getValor2());
  }

  //Test interior
  public void testMultiplicacionPositivo() {
    Multiplicacion mult = new Multiplicacion(3.0f, 5.5f);

    float r = mult.multiplicacion();

    assertEquals(16.5f,r);
  }

  //Test interior
  public void testMultiplicacionNegativo() {
    Multiplicacion mult = new Multiplicacion(3.0f, -5.5f);

    float r = mult.multiplicacion();

    assertEquals(-16.5f,r);
  }

  //Test interior
  public void testMultiplicacionZero() {
    Multiplicacion mult = new Multiplicacion(3.0f, 0);

    float r = mult.multiplicacion();

    assertEquals(0.0f,r);
  }
}