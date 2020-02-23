package day19;

import java.util.Scanner;

public class SpeedAction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter the start speed: ");
        int StartSpeed = scan.nextInt();
        System.out.println("Please enter the end speed: ");
        int EndSpeed = scan.nextInt();

//        for (int i = 0; i < 10; i++){
//            System.out.println(i + " ");
//        }

        for (int i = StartSpeed; i <= EndSpeed; i++){
            System.out.print(i + ",");
        }

    }
}
