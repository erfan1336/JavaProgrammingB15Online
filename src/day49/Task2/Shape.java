package day49.Task2;

public abstract class Shape{

    String name;
    double area;

    public abstract void calculateArea();

    public Shape(String name) {
        this.name = name;
    }
}
