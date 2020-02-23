package repl_problems;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class P138_reversedSentence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


        String reversed = "";


        //TODO: start your code here
        //splittted= splittted.replace(” “, “”);

        String[] splittted = sentence.split(" ");

        for(int i = splittted.length-1 ; i>=0; i--){

             System.out.print((splittted[i] + " "));
            // reversed = splittted[i] + " ";
        }



        //End your code here. do not modify below statement
        System.out.println(reversed);
    }
}
