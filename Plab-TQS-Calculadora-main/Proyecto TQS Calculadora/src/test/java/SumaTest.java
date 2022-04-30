import controlador.MockSuma;
import junit.framework.TestCase;
import model.Suma;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SumaTest extends TestCase {

  @InjectMocks //Injectem els mocks creats a la linia d'abaix i els injectem al objecte que volem simular
  Suma s = new Suma();

  @Mock //creació del mock object
  MockSuma sM;

  @Before //Modifiquem els comportaments als que nosaltres volem
  public void init(){
    when(sM.sumaAuxiliar(5.0f,5.0f)).thenReturn(10.0f);
  }

  @Test
  public void testConstructorDefecto() {
    Suma x = new Suma();
    assertEquals(0.0f, x.getValor1());
    assertEquals(0.0f, x.getValor2());
    assertEquals(0.0f, x.getResultado());
  }

  @Test
  public void testConstructorSuma() {
    Suma opAritmetica = new Suma(5.0f, 3.0f);

    assertEquals(5.0f,opAritmetica.getValor1());
    assertEquals(3.0f,opAritmetica.getValor2());
  }

  //Test interior
  @Test
  public void testSuma() {
    Suma opAritmetica = new Suma(5,3);

    float resultatFuncio = opAritmetica.suma();
    float resultatExpected = 8;

    assertEquals(resultatExpected, resultatFuncio);
  }

  //Test interior
  @Test
  public void testSumaNegativo() {
    Suma opAritmetica = new Suma(5,-8);

    float resultatFuncio = opAritmetica.suma();
    float resultatExpected = -3;

    assertEquals(resultatExpected, resultatFuncio);
  }

  @Test
  public void testSumarMock(){
    float resultado = s.sumarMock(5,5);
    assertEquals(10.0f,resultado);
  }



}