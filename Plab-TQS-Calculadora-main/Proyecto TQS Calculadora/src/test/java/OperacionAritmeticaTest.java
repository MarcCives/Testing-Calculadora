import controlador.OperacionAritmetica;
import junit.framework.TestCase;
import org.junit.Test;

public class OperacionAritmeticaTest extends TestCase {

  @Test
  public void testConstructorDefecte() {
    OperacionAritmetica opAritmetica = new OperacionAritmetica();

    assertEquals(0.0f, opAritmetica.getValor1());
    assertEquals(0.0f, opAritmetica.getValor2());
    assertEquals(0.0f, opAritmetica.getResultado());
  }

  @Test
  public void testGetValor1() {
    OperacionAritmetica opAritmetica = new OperacionAritmetica();

    opAritmetica.setValor1(3.0f);
    assertEquals(3.0f,opAritmetica.getValor1());
  }

  @Test
  public void testGetValor2() {
    OperacionAritmetica opAritmetica = new OperacionAritmetica();

    opAritmetica.setValor2(5.3f);
    assertEquals(5.3f,opAritmetica.getValor2());
  }

  @Test
  public void testGetResultado() {
    OperacionAritmetica opAritmetica = new OperacionAritmetica();

    opAritmetica.setResultado(7.1f);
    assertEquals(7.1f,opAritmetica.getResultado());
  }
}

