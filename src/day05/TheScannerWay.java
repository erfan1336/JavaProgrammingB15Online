package day05;

import java.util.Scanner;


public class TheScannerWay {
    public static void main(String[] args) {
        //ask user for name
        //and capture the result
        //print your name is
        //ask user for birthday
        //and cupture the result
        //print the age!
        //ask user for height
        //and capture the result
        //print the height!!

        //create a scanner object

        //Scanner is data type; scan is the name; new Scanner(System.in) is the value
        Scanner scan3434 = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = scan3434.next();

        //String name = scan.nextDouble();
        //String name = scan.nextFloat();
        //String name = scan.nextBoolean();


        System.out.println("My name is " + name);

        System.out.println("What is your birth year? ");
        int birthYear = scan3434.nextInt();
        int age = 2019 - birthYear;
        System.out.println(name + " Your age is " + age);

        System.out.println("Whats your height? ");
        double height = scan3434.nextDouble();

        System.out.println("Your height is: " + height);

    }
}
