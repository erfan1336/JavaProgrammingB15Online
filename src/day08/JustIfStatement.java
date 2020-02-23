package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your current speed? ");
        int currentSpeed = scan.nextInt();
        System.out.println("what is speed limit?");
        int speedLimit = scan.nextInt();

        if (currentSpeed > speedLimit){
            System.out.println("pulled over by police");
        }else {
            System.out.println("go to shopping");
        }
        System.out.println("The end of the story");
    }

}
