package model;

import controlador.OperacionAritmetica;

public class Exponente extends OperacionAritmetica {

    private float ex;

    public Exponente() {
        ex = 0;
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
    }

    public Exponente(float x) {
        ex = x;
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
    }

    public float exponente() {
        return resultado = (float) Math.exp(ex); // //Math.exp calcula l'exponent amb la variable pasada per paràmetre. exp té un valor fixe 2,7...
    }

    public float getEx() { return ex; }

}
