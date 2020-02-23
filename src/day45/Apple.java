package day45;

public class Apple extends Fruit {

    //Constructor
    public Apple(){
        // I want to reuse the functionality that
        // already written in super class constructor
        // we can use super() or super(argument if needed) to call super class's constructor

        //super();

        //how to call the constructor with 1 arg
        super("test",55);

        //can we use super() call more than one?
        // NO!!!!!!!!!!!!!!!!!!!!!!
    }

    // if we don't have any constructor, we woud get Default Constructor as below, and compiler automatically
    // call no arg constructor of super class by inserting super()
    // Default as below:

//    public Apple(){
//        super();
//    }

    public static void main(String[] args) {

        Apple a1 = new Apple();

    }
}
