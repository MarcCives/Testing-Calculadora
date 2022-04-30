package model;

import controlador.OperacionAritmetica;

public class Logaritmo extends OperacionAritmetica {

    private double lg;
    double resultado;

    public Logaritmo() {
        lg = 0.0;
        valor1 = 0.0f;
        valor2 = 0.0f;
    }

    public Logaritmo(double loga) {
        lg = loga;
        resultado = 0.0;
        valor1 = 0.0f;
        valor2 = 0.0f;
    }

    public double getLog() { return lg; }

    public double getResultadoLog() {return resultado;}

    public double logaritmo(){
        resultado = Math.log10(lg); //Math.log10 calcula el logaritme en base 10 del valor passat per paràmetre a travès de la llibreria Math
        return resultado;
    }

}
