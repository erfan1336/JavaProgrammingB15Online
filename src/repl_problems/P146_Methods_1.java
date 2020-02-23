package repl_problems;

import java.util.Scanner;

public class P146_Methods_1 {

    public static void main(String[] args) {

        plus();

    }

    public static void plus(){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.println("please enter the second number: ");
        int num2 = input.nextInt();

        int result = num1 + num2;
        System.out.println( "result is " + result);

        return;




    }

}
