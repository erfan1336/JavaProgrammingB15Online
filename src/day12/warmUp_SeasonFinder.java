package day12;

import java.util.Scanner;

public class warmUp_SeasonFinder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the month:");
        int month = scan.nextInt();

        if (month > 12 || month < 1) {
            System.out.println("Invalid Input");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Fall");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");

        }
//        else {
//            System.out.println("Invalid Month");
//        }
    }
}