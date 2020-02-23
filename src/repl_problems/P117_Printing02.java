package repl_problems;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class P117_Printing02 {

    public static void main(String[] args) {

        System.out.println("Please enter the strings : ");
        Scanner input = new Scanner(System.in);

        String[] arr = new String[8];

        String first = arr[0];
        String second = arr[2];

        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
            System.out.println(arr[i] + " " + arr[i]);


        }
        System.out.println(arr[0] + " " + arr[1]);
        System.out.println(arr[2] + " " +arr[3]);
        System.out.println(arr[4] + " " +arr[4]);




        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below

    }
}
