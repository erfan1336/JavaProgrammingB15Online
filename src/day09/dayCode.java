package day09;

import java.util.Scanner;

public class dayCode {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the daycode: ");
        int dayCode = scan.nextInt();

        if (dayCode == 1) {
            System.out.println("Its Monday");
        } else if (dayCode == 2) {
            System.out.println("Tuesday");

        }

    }
}
