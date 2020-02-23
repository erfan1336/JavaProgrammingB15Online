package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String password = scan.next();

        while (!password.equals("B15")){
            System.out.println("Wrong Password, TRY again");
            password = scan.next();
        }
        System.out.println("Open SESEAME !!");

    }
}
