package repl_problems;

import java.util.Arrays;
import java.util.Scanner;

public class P137_reversingSentences {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the string : ");
        String sentence = input.nextLine();

        String[] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));

//        int middleIndex = (sentenceArray.length)/2;
//
//        for (int i = 0; i <sentenceArray.length ; i++) {
//            int lastIndex = sentenceArray.length -1;
//
//            sentenceArray[i] = sentenceArray[lastIndex-i];
//
//        }
//        System.out.println(Arrays.toString(sentenceArray));


        String[] arr = sentence.split(" ");
        for (int i=arr.length-1; i>=0; i--) {
            System.out.println(arr[i]);
        }

    }
    //Erfan Hamit Ablikim Loves codes in Java
}
