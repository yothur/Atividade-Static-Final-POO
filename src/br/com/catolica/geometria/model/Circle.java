package br.com.catolica.geometria.model;

public class Circle extends Shape{
    private final double radius;


    public Circle(String nome, String color, double radius){
        super(nome, color);
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }


}
