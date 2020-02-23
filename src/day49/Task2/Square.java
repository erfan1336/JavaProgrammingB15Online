package day49.Task2;

public class Square extends Shape implements Drawable {

    int length;

    public Square(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Draw perfect square");
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of square is = " + (length * length));
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
