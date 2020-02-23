package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet","red","Fuji");

        //what can i access using reference variable a1
        //a1 has Apple as reference type, so we can access anything visible inside apple
        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);

        //methods can get
        a1.getDigest();
        System.out.println("------------------------------------------");

        Fruit f1 = a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);

       // System.out.println(f1.toString());
       // f1.type  //we cannot access type coming from apple if we refer it as Fruit

        //if Fruit does not have getDigested method
        //below will not compile
        //because only reference type decide what you can call it
        f1.getDigest();



        //Fruit is reference type, Apple is actual object type
        Fruit f2 = new Apple("crispy but tasteless","hot red","Gala");
        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "Blood Red", 10);

        Fruit[] myFruits = {f1,f2,f3,f4};
        for (Fruit each : myFruits){
            each.getDigest();
        }


        ///List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4);

        //this is just a regular list with 4 items pre-filled
        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for (Fruit each : fruitList){
            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class Type: " +  each.getClass().getSimpleName());
        }



    }
}
