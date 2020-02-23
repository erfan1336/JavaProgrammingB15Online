package day44;

public class Train extends Vehicle {


    int wagonCount;
    public void makeChoChoSound(){
        System.out.println("Cho cho cho");
    }

    public static void main(String[] args) {

        Train t1 = new Train();
        t1.makeChoChoSound();

        //these attributes we got from Vehicle
        t1.make = "Thomas";
        t1.year = 1999;

        //calling the method we gro from Vehicle
        t1.start();
        t1.goForward();
    }


}