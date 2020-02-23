package day49.Task2;

public class callMethod {

    public static void main(String[] args) {

        Square s1 = new Square("Erfan_Square",5);
        s1.calculateArea();
        s1.draw();


        Circle c1 = new Circle("Circle", 2);
        c1.calculateArea();
        c1.draw();

    }
}
