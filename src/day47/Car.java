package day47;


//This class designed to be super class
//to provide reusable fields and methods for subclasses
//i don't need to create car object using this class
public abstract class Car {

    int year;
    String brand;

    //ONLY abstract class can have abstract method
    //it has abstract keyword
    //and it does not have body, Doest NOT have {}
    //it end with semicolon ;
    //It meant to be Overridden to provide body in sub class
    public abstract void start();

    public abstract void stop();

    public abstract void goForward();

    public abstract void goBackward(String direction);

    public void doCarThing(){
        System.out.println("abstract class can have normal method");
    }



}
