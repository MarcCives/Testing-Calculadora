import controlador.MockResta;
import junit.framework.TestCase;
import model.Resta;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RestaTest extends TestCase {

  @InjectMocks //Injectem els mocks generats a la linia d'abaix a l'objecte que volem simular
  Resta r = new Resta();

  @Mock //creació del mock object
  MockResta rM;

  @Before //Modifiquem els comportaments als que nosaltres volem
  public void init(){
    when(rM.restaAuxiliar(5.0f,5.0f)).thenReturn(0.0f);
  }

  @Test
  public void testConstructorDefecto() {
    Resta x = new Resta();
    assertEquals(0.0f, x.getValor1());
    assertEquals(0.0f, x.getValor2());
    assertEquals(0.0f, x.getResultado());
  }

  @Test
  public void testConstructorResta() {
    Resta opAritmetica = new Resta(5.0f, 3.0f);

    assertEquals(5.0f,opAritmetica.getValor1());
    assertEquals(3.0f,opAritmetica.getValor2());
  }

  //Test interior
  @Test
  public void testResta() {
    Resta opAritmetica = new Resta(5.5f,3);

    float resultatFuncio = opAritmetica.resta();
    float resultatExpected = 2.5f;

    assertEquals(resultatExpected, resultatFuncio);
  }

  //Test interior
  @Test
  public void testRestaNegativo() {
    Resta opAritmetica = new Resta(5.5f,-8);

    float resultatFuncio = opAritmetica.resta();
    float resultatExpected = 13.5f;

    assertEquals(resultatExpected, resultatFuncio);
  }

  @Test
  public void testRestarMock() {
    float x = r.restarMock(5.0f,5.0f);
    assertEquals(0.0f,x);
  }

}