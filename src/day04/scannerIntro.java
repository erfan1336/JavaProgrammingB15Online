package day04;

import java.util.Scanner;

public class scannerIntro {

    public static void main(String[] args) {

        //User Input

        //Step 1. Use scanner to create scanner object
        Scanner scan33 = new Scanner(System.in);

        //Step 2. Ask user to enter name
        System.out.println("Please enter your name: ");

        //capture what user typed on keyboard in console
        String firstName = scan33.next();
        int age = scan33.nextInt();

        //print the result
        System.out.println("You have entered :" + firstName + ", Age you entered is " + age);

    }
}
