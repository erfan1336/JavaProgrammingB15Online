package repl_problems;

import java.util.Scanner;

public class Problem_87 {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number for inhabitants: ");
        int inhabitants = scan.nextInt();
        int counterDay = 0;


        for (int i = inhabitants; i > 0; i--) {

            System.out.println("Day " + counterDay + " " + "[" + (inhabitants) + "]");
            inhabitants = inhabitants / 2;
            counterDay++;
            if (inhabitants == 0){
                System.out.println("---EXTINCT---");
            }
        }

//        int i = 0;
//        while (inhabitants != 0) {
//
//            System.out.println("Day " + i + " " + "[" + (inhabitants) + "]");
//            inhabitants = inhabitants / 2;
//            ++i;
//        }
//        if (inhabitants == 0){
//            System.out.println("---EXTINCT---");
//        }



    }
}

