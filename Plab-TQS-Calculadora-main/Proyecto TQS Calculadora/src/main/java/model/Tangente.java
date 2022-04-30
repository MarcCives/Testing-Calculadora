package model;

import controlador.OperacionAritmetica;

public class Tangente extends OperacionAritmetica {

    private double degree;
    double resultado;

    public Tangente() {
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
        degree = 0;
    }

    public Tangente(double deg) {
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
        degree = deg;
    }

    public double tangente() {

        if (degree == 90) {
            System.out.println("Error: Aquesta operació no es válida");
            return resultado = 1.633123935319537E16; // Es comprova que el grau introduit sigui 90 perque aquest valor fa referència a l'infinit i no és vàlid
        }
        else {
            if(degree == 270)
            {
                System.out.println("Error: Aquesta operació no es válida");
                return resultado = 5.443746451065123E-15; // Es comprova que el grau introduit sigui 90 perque aquest valor fa referència a -infinit i no és vàlid
            }
            else{
                double radians = Math.toRadians(degree);  //toRadians() fa la conversió de graus a radians
                resultado = Math.tan(radians); //Math.tan calcula la tangent del valor passat per paràmetre amb la llibreria Math
                return resultado;
            }

        }
    }
    public double getDegree() {return degree;}

    public double getResultadoTangente() {return resultado;}

}
