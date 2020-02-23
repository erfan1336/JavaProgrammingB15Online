package day18;

import java.util.Scanner;

public class SmartLockWithDoWhileLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK KNOCK: ");

        String Password;

        do {
            System.out.println("Whats the password? ");
            Password = scan.next();
        }while ( !Password.equals("B15"));

        System.out.println("Door is open");
    }



}
