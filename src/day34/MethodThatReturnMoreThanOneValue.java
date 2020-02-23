package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        String sentence = "I love Java";

        char[] eachChar = sentence.toCharArray();
        String[] eachWords = sentence.split(" ");

        int[] resultArr = returnBoysVSGirls();
        System.out.println(Arrays.toString(resultArr));

    }


    // create a method that return int array

    public static int[] returnBoysVSGirls(){
        int[] boysGirlsCount = {56,52};
        return boysGirlsCount;
    }
}
