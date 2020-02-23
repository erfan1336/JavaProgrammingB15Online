package day59.CollectionFrameWork;

import java.util.*;


//a class extends another class
//an interface extends another interface
//a class implements one or more interfaces

public class CollectionIntro {


    public static void main(String[] args) {


        // List<String> names = new ArrayList<>();
        //List interface extends Collection Interface
        //and ArrayLIst implements List Interface
        //so we can safely say ArrayList IS-A Collection



        Collection<String> names = new ArrayList<>();
        //with this assignment we can access only what Collection interface have
        //so we can learn what any type of Collection including Set, Queue, List have in common

        names.add("Erfan");
        names.add("Hamit");
        names.add("Patigul");
        names.add("Gulzar");
        names.add("Guldane");
        names.add("Ghulja City");


        names.addAll(names); //addAll method parameter type is Collection(Interface) so we can pass anything IS-A Collection

        System.out.println("names = " + names);

        Collection<String> toRemove = Arrays.asList("Ghulja City");
        names.removeAll(toRemove);
        System.out.println("names after removal = " + names);

        //Lambda Expression
        //Optionally this is how we can use forEach method to print out the everything
        names.forEach(each -> System.out.println(each));


    }

}


/**
 * The word Collection everywhere :
 *
 * Collection Framework --> taking about entire things, entire topic
 *
 * Collection Interface --> one interface under the entire Collection Framework
 *
 * Collection(s) Class ---> its a class, just like Array and Arrays, is a utility class with many static method
 *                                      for example : Collections.sort(your collection object)
 *
 *
 *
 * List is only data structure have Index, none of other data structure has Index
 */
