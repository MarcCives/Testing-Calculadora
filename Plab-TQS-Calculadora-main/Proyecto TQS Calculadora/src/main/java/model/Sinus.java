package model;

import controlador.OperacionAritmetica;

public class Sinus extends OperacionAritmetica {
    private double degrees;
    double resultado;

    public Sinus() {
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
        degrees = 0;
    }
    public Sinus(double degrees1)    {
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
        degrees = degrees1;

    }

    public double sinus(){
        double radians = Math.toRadians(degrees); //Passem els graus a radians
        resultado = Math.sin(radians); //Math.sin et calcula el sinus del valor passat per paràmetres amb la llibreria Math
        return resultado;
    }

    public double getDegrees() {return degrees;}

    public double getResultadoSinus() {
        return resultado;
    }


}
