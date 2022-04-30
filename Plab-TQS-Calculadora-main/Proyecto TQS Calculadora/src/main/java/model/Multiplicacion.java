package model;

import controlador.OperacionAritmetica;

public class Multiplicacion extends OperacionAritmetica {

  public Multiplicacion(){
    super();
  }

  public Multiplicacion(float x, float y) {
    valor1 = x;
    valor2 = y;
  }

  public float multiplicacion() {
    resultado = valor1 * valor2;
    return resultado;
  }

}
