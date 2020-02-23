package day09;

import java.util.Scanner;

public class CitizenIdentifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String citizenType;

        System.out.println("Please enter the citizen age: ");
        int age = scan.nextInt();

        if (age > 65) {
            citizenType = "Senior";
            //System.out.println(citizenType);
        } else {
            citizenType = "Non-Senior";
            //System.out.println(citizenType);
        }
        System.out.println(citizenType);

    }
}
