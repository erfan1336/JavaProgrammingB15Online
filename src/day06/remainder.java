package day06;

import java.util.Scanner;

public class remainder {

    public static void main(String[] args) {

        // + - * /
        // %

        System.out.println( 5/2 );

        System.out.println( 5.0/2);

        System.out.println( 5.0 / 2f);

        System.out.println( 5/2f);

        // modules operations
        System.out.println(5 % 2);

        System.out.println(99 % 10);

        System.out.println(100 % 10);

        // declare a variable called minutes, data type int
        // ask user to enter minutes as whole number
        // print the result in x hour y minutes format
        // for example 135 minutes, 2 hour 15 minutes

        //int x = minutes / 60;
        //int y = (minutes % 60) ;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter time in minutes: ");
        int minutes = input.nextInt();



        int x = minutes /3600;
        int y = minutes % 60;
        int z = minutes % 60;

        System.out.println("Time is " + x + " hours, " + y + " minutes" + z + "seconds");






    }
}
