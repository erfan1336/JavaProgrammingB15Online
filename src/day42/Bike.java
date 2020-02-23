package day42;

public class Bike {

    int gear;
    String brand;
    int speed;

    //Constructor is a block of code that has same name as class name
    //and has nothing to do with field/instance variable

    public Bike(){
        System.out.println("Message from constructor");
        gear = 1;
    }

    //Constructor overloading
    public Bike(int newGear){
        gear = newGear;
    }

    //Constructor overloading
    public Bike(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public Bike(String str){
        System.out.println("Accepts string ");
    }



}
