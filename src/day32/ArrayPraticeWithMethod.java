package day32;

import java.util.Arrays;

public class ArrayPraticeWithMethod {

    public static void main(String[] args) {

        int[] score = {2,3,4,6,7,8,10,12};
        //call the methods

        printMaxOfIntArray(score);
        printMinOfIntArray();
        printSumOfIntArray();


        //first way to pass the array
        compare2arraySize(new String[] {"sezgin" ,"senay","gulhan"}, new String[]{"Araz"});

        // another way to pass the array
        String[] names1 = {"Superman", "batman", "flahs"};
        String[] names2 = {"wonderman","cyborg","aquaman"};

        compare2arraySize(names1,names2);



    }

    //methods:

    public static void printMaxOfIntArray(int[] score){

        System.out.println("array has items : " + Arrays.toString(score));

        int max = score[0];
        for (int i = 0; i <score.length ; i++) {
            if (max < score[i]){
                max = score[i];
            }
        }
        System.out.println("max is : " + max);

    }

    public static void printMinOfIntArray(){

    }

    public static void printSumOfIntArray(){

    }

    public static void compare2arraySize(String[] arr1, String[] arr2){

        if (arr1.length > arr2.length){
            System.out.println("array 1 has more item");
        }else if (arr1.length < arr2.length){
            System.out.println("array 2 has more item");
        }else {
            System.out.println("they have same size");
        }
    }



}
