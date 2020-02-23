package repl_problems;

import java.util.Arrays;
import java.util.Scanner;

public class P110_PrintFirst_Last {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        for (String eachWord : words){
            System.out.print(eachWord.charAt(0));
            System.out.println(eachWord.charAt(eachWord.length()-1));
        }




    }
}
