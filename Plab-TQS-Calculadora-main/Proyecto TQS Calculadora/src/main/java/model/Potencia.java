package model;

import controlador.OperacionAritmetica;

public class Potencia extends OperacionAritmetica {
    public boolean comp;

    public Potencia() {
        super();
    }
    public Potencia(float v1, float v2) {
        super();
        valor1 = v1;
        valor2 = v2;
    }

    public float potencia() {
        resultado = (float) Math.pow(valor1, valor2); //Math.pow et calcula el valor1 elevat al valor2 amb la llibreria Math
        return resultado;
    }
}
