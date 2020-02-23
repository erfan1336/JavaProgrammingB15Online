package OffieHours;

/*
Person p1 = new Person;
Object O = new Person;
Person p1 = (Person) O;  //Downcasting :

Animal O = new Cat();
Dog P = (Dog) O;  //Downcasting : Animal --> Dog



Person p1 = new Person;
Object O = p1;
Object O = (Object) p1;   //Upcasting : Object O --> Person



*/

class circle{

    public double radius;

    public circle(double radius){
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj){   //check if two circles have same radius or not

         circle c1 = (circle) obj;

       // Object O1 = new circle(3.4);
       // Object O2 = new String();
        if (( obj instanceof circle)) {// check if obj is circles object or not
            if (radius == ((circle) obj).radius) { //check if two circles have same radius or not
                return true;
            }
        }

        return false;
    }
}
/*
instanceof:
    syntax:
        referenceName  instanceof  className
 */


public class TestCircle {

    public static void main(String[] args) {
        circle c1 = new circle(3.5);
        circle c2 = new circle(4.5);
        Object c3 = new String();

        System.out.println(c1.equals(c2));
        System.out.println("c2.equals(c3) = " + c2.equals(c3));
    }

}
