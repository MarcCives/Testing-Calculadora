package model;

import controlador.MockResta;
import controlador.OperacionAritmetica;

public class Resta extends OperacionAritmetica {

  public Resta(){
    super();
  }

  MockResta mockR;

  public Resta(float x, float y){
    valor1 = x;
    valor2 = y;
  }

  public float resta(){
    resultado = valor1 - valor2;
    return resultado;
  }

  public float restarMock(float x, float y) {
    //Sumar en la comprobació
    return mockR.restaAuxiliar(x,y);
  }
}
