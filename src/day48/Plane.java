package day48;


//we build relationship between class and interface using implement keyword (compared to extends keyword to class....)
//it will build IS-A Relationship  | Inheritance relationship
//we can say Plane IS-A Flyable
//since we are inheriting an abstract method, we need to provide body by overriding

public class Plane implements Flyable{

    String name;
    int capacity;
    int speed;


    @Override
    public void fly() {
        System.out.println("Plane is flying");

    }


    //Not good practice to build main method here;
    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.fly();

        //anything static, we can access in static way
        //including the static field of interface
        System.out.println(Flyable.HAVE_WING);


        //if we have static field in this class, can we access them static main method directly?
        //yes, we can
        System.out.println();
    }
}
