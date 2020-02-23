package day18;

import java.util.Scanner;

public class GiveMe5$20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the bill amount: 5 or 20 bills ");
        //String money = scan.nextLine();

        int x = scan.nextInt();
        // or we can use  !(x==5 && x==20)
        while (x!=5 && x!=20){
            System.out.println("Not the bill i am looking for");
            System.out.println("Give me only 5 or 20");
            x = scan.nextInt();
        }
        System.out.println("Happy ending, baby got the money!!");
    }
}
