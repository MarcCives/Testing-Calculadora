package model;

import controlador.OperacionAritmetica;

public class Division extends OperacionAritmetica {

  public Division(){
    super();
  }

  public Division(float x, float y) {
    valor1 = x;
    valor2 = y;
  }

  public float division() {

    if(valor2 == 0) { // Comprovem si el denominador es 0
      System.out.println("Error divisió per 0");
      return resultado = 0;
    }
    else {
      resultado = valor1 / valor2;
      return resultado;
    }
  }
}
