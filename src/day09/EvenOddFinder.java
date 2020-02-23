package day09;

import java.util.Scanner;

public class EvenOddFinder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int input = scan.nextInt();

        if ((input % 2) == 0) {
            System.out.println("This is a even number");
        } else {
            System.out.println("This is an odd number");
        }

    }
}
