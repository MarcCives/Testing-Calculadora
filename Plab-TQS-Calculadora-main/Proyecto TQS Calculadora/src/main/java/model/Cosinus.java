package model;

import controlador.OperacionAritmetica;

public class Cosinus extends OperacionAritmetica {

    private double degree;
    double resultado;

    public Cosinus() {
        degree = 0;
        resultado = 0;
        valor1 = 0;
        valor2 = 0;
    }

    public Cosinus(double degrees) {
        degree = degrees;
        resultado = 0;
        valor1 = 0;
        valor2 = 0;
    }

    public double cosinus() {
        double radians = Math.toRadians(degree); //Passem els degrees a radians
        resultado = Math.cos(radians); //Math.cos calcula el cosinus dels radians passats per paràmetres amb la llibreria Math
        return resultado;
    }

    public double getDegree(){ return degree; }

    public double getResultadoCosinus() {return resultado;}


}