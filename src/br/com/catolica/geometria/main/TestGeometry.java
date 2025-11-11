package br.com.catolica.geometria.main;

import br.com.catolica.geometria.model.Circle;
import br.com.catolica.geometria.model.GeometryCalculator;
import br.com.catolica.geometria.model.Rectangle;

public class TestGeometry {
    public static void main(String[] args) {

        //Teste GeometryCalculator

        System.out.println("Area circulo r=5: " + GeometryCalculator.areaCirculo(5));
        System.out.println("É triangulo válido? " + GeometryCalculator.validarTriangulo(3,4,5));

        //Teste Shapes

        Circle circle = new Circle("Circulo1", "Vermelho", 5.0);
        Rectangle rectangle = new Rectangle("Retângulo1", "Azul", 4.0, 6.0);

        System.out.println(circle.getDescription());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimetro: " + circle.calculatePerimeter());


        System.out.println(rectangle.getDescription());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimetro: " + rectangle.calculatePerimeter());


    }
}
