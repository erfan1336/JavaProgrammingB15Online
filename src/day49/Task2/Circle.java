package day49.Task2;

public class Circle extends Shape implements Drawable {

    int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void draw() {

        System.out.println("Draw perfect circle.");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of circle is = " + (3.14* radius*radius));

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
