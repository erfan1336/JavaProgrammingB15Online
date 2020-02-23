package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {

        //Arrays class is a class from java.util package
        //it has a lot pre-build methods to work with array object

        // for printing the content of the array
        //toString ----->>> Arrays.toString(yourArrayHere);

        String[] movies = {"Hero", "Badman", "Superman", "Wonder Women","AquaMan", "Cyborg","Flash"};
        System.out.println(movies);
        System.out.println(Arrays.toString(movies));

        String savingMoviesAsString = Arrays.toString(movies);
        System.out.println(savingMoviesAsString);
        //how to get first character of movies variable
        System.out.println(savingMoviesAsString.charAt(0));
        System.out.println(savingMoviesAsString.charAt(1));
        System.out.println(savingMoviesAsString.charAt(2));
        System.out.println(savingMoviesAsString.charAt(3));

        System.out.println("---------------------------------------------");
        int[] numbers = {10,44,55,3,78};
        System.out.println("Array.toString(Numbers) Result: " );
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------------");
        double[] prices = {10.99, 2.98, 4.32};
        String pricesString = Arrays.toString(prices);
        System.out.println(pricesString);

        for (int i = 0; i < pricesString.length(); i++) {
            System.out.print(pricesString.charAt(i) + " -> ");

        }



        //for sorting an Array in ascending order
        // sort ----------->>>>Arrays.sort(yourArrayHere);

        //for checking for equality of 2 array object content
        //equals  -------->>> Arrays.equals(firstArray, secondArray);






    }
}
