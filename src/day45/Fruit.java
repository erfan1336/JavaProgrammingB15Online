package day45;

public class Fruit {

    //Constructor

    //Always add No argument constructor in super class to avoid unnecessary error of sub class calling super classes
    public Fruit(){
        System.out.println(" Fruit Constructor Message !!! --- No Arguments ");
    }

    public Fruit(String str,int age){
        System.out.println("One Arg Fruit Constructor. --- With One Argument");
    }
}
