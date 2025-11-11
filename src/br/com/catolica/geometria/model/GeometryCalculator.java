package br.com.catolica.geometria.model;

public final class GeometryCalculator {
    public static final double PI = 3.14;


    public static double areaCirculo(double raio){
        return PI * Math.pow(raio, 2);
    }


    public static double areaRetangulo(double base, double altura){
        return base * altura;
    }

    public static double areaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }


    public static double perimetroCirculo(double raio){
        return 2 * PI * raio;
    }


    public static boolean validarTriangulo(double lado1, double lado2, double lado3){
        return lado1 + lado2 > lado3;
    }


}
