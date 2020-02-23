package day12;

import java.util.Scanner;

public class seasonChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the season: ");
        String season = scan.nextLine();

        if (season.equalsIgnoreCase("spring")){
            System.out.println("Hiking, spring festival, cool weather");
        }else if (season.equalsIgnoreCase("summer")){
            System.out.println("Pool time");
        }else if (season.equalsIgnoreCase("fall")){
            System.out.println("Halloween, just code");
        }else if (season.equalsIgnoreCase("winter")){
            System.out.println("Ski, snowman");
        }else {
            System.out.println("Not valid input");
        }
    }
}
