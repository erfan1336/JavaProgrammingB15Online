package day48;


import java.util.ArrayList;
import java.util.List;

//This is the class to build main method to call
public class BouncingParty {

    public static void main(String[] args) {

        Kangaroo b1 = new Kangaroo("Coco", 10);
        System.out.println("b1 = " + b1);
        b1.bounce();
        b1.eat();
        b1.carryChildInThePocket();
        b1.kickBox();
        System.out.println("----------------------------------------------");

        Ball b2 = new Ball("Round","Blue");
        System.out.println("b2 = " + b2);
        b2.bounce();

        System.out.println("Bouncible.GRAVITY = " + Bouncible.GRAVITY);




    }
}
