import junit.framework.TestCase;
import model.Division;
import org.junit.Test;

public class DivisionTest extends TestCase {

  @Test
  public void testConstructorDefecto() {
    Division x = new Division();
    assertEquals(0.0f, x.getValor1());
    assertEquals(0.0f, x.getValor2());
    assertEquals(0.0f, x.getResultado());
  }

  @Test
  public void testConstructor() {
    Division x = new Division(5f,2.5f);
    assertEquals(5.0f,x.getValor1());
    assertEquals(2.5f,x.getValor2());
  }

  //Flujo basico

//Test válido interior
  @Test
  public void testDivision() {
    Division x = new Division(5f, 2.5f);
    float resultado = x.division();
    assertEquals(2.0f, resultado);
  }

//Test válido interior
  @Test
  public void testDivisionNegativo() {
    Division z = new Division(5.0f, -2.0f);
    float resultado = z.division();
    assertEquals(-2.5f,resultado);
  }

  //Flujo alternativo

  //Test válido interior
  @Test
  public void testDivisionAlternativo() {
    Division y = new Division(0f, 5f);
    float resultado = y.division();
    assertEquals(0.0f, resultado);
  }

  //Test no válido exterior
  @Test
  public void testDivisionError() { //divisió per zero
    Division z = new Division(5.0f,0.0f);
    float resultado = z.division();
    assertEquals(0.0f,resultado);
  }

  //Test interior limit
  @Test
  public void testDivisionLimiteSuperior() {
    Division z = new Division(5.0f,0.1f);
    float resultado = z.division();
    assertEquals(50.0f,resultado);
  }

  //Test interior limit
  @Test
  public void testDivisionLimiteInferior() {
    Division z = new Division(5.0f,-0.1f);
    float resultado = z.division();
    assertEquals(-50.0f,resultado);
  }
}