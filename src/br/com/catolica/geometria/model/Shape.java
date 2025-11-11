package br.com.catolica.geometria.model;

public abstract class Shape {
    protected final String name;
    protected  final String color;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public final String getDescription(){
        return String.format("Forma: [Nome: %s, Cor: %s]", this.name, this.color);
    }
}
