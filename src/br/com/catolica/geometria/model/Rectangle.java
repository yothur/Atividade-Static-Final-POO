package br.com.catolica.geometria.model;

public class Rectangle extends Shape{

    private final double width;
    private final double height;


    public Rectangle(String name, String color, double width, double height){
        super(name, color);
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
