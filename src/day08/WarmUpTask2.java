package day08;

import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess My Favorite Number : ");
        int myFavoriteNumber = scanner.nextInt();

        if (myFavoriteNumber == 300){
            System.out.println("BINGO!!");
        }
        else {
            System.out.println("You are not my best friend, Try Again: ");
        }
    }
}
