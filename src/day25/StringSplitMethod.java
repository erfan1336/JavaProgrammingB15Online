package day25;

import java.util.Arrays;

public class StringSplitMethod {

    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] allWord = sentence.split(" ");
        System.out.println("All words = " + Arrays.toString(allWord));

        System.out.println("How many word we have in this sentence? = " + allWord.length);

        System.out.println("Last word in this sentence is = " + allWord[allWord.length - 1]);

        String sentence2 = "Everything is awesome !!!!";
        //split by letter e

        String[] splitBy_e_Array = sentence2.split("e");
        System.out.println("Split by e word = " + splitBy_e_Array);
        System.out.println("Split by e word " + Arrays.toString(splitBy_e_Array));

        for (String eachpiece:splitBy_e_Array) {
            System.out.println("eachPieces = <" + eachpiece + ">");
        }


        //Split the sentene2 by is and print out the result
        String[] splitBy_is_Array = sentence2.split("is");

        System.out.println("splitBy_is_Array" + splitBy_is_Array);
        System.out.println("splitBy_is_Array" + Arrays.toString(splitBy_is_Array));

        for (String eachPiecesForIs: splitBy_is_Array) {
            System.out.println("eachPiecesForIs = <" + eachPiecesForIs);
        }

    }
}
