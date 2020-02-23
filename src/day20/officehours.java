package day20;

import java.util.Scanner;

public class officehours {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 1st word with single character to start with: ");
        String first = scan.next();
        char firstAsChar = first.charAt(0);

        System.out.println("Please enter 2nd word with single character to start with: ");
        String second = scan.next();
        char secondAsChar = second.charAt(0);

        //user enter A for first part
        //user enter C for second part
        //expected result should be ABC

        for (char c = firstAsChar; c <= secondAsChar; c++){
            System.out.println(c + " ");
        }


    }
}
