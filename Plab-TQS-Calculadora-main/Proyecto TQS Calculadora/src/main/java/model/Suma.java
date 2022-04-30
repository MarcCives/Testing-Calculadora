package model;

import controlador.MockSuma;
import controlador.OperacionAritmetica;

public class Suma extends OperacionAritmetica {

  MockSuma mockS;

  public Suma(){
    super();
  }

  public Suma(float x, float y){
    valor1 = x;
    valor2 = y;
  }

  public float suma(){
    resultado = valor1 + valor2;
    return resultado;
  }

  public float sumarMock(float x, float y) {
    //Sumar en la comprobacion
    return mockS.sumaAuxiliar(x,y);
  }
}
