package day12;

import java.util.Scanner;

public class fizzBuzzNumberIdentifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int input = scan.nextInt();

        if (input% 5 == 0 && input%3 == 0 ){
            System.out.println("Input is a Fizz && Buzz number");
        }else if (input % 5 == 0){
            System.out.println("Input is Fizz number only");
        }else if (input % 3 == 0){
            System.out.println("Input is Buzz number only");
        }else {
            System.out.println("Input is not fizz nor buzz number ");
        }
    }
}
