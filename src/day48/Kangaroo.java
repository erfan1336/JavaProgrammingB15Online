package day48;

// a class can implement more than one interface
public class Kangaroo implements Bouncible, BoxerWithBellPouch {

    //instance fields
    String name;
    int jumpDistance;

    //Constructor
    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    //Methods overriding
    public void eat(){
        System.out.println("Kangaroo with name " + name + " is eating");
    }

    public void bounce(){

        System.out.println("This " + name + " can jump " + jumpDistance + " meters and it would be " +
                "nice to have " + GRAVITY + " gravity");

    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }



    //these two method are overriding from BoxerWithBellyPouch
    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name " + name + " is boxing.");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo with name " + name + " carry children in the pocket.");
    }
}
