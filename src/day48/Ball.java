package day48;

public class Ball implements Bouncible {


    String shape;
    String color;

    //Constructor
    public Ball(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    //Methods Override
    public void bounce(){
        System.out.println("This "+color + " ball with " + shape + " shape is bouncing if gravity is " + GRAVITY);

    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
