package repl_problems;

import java.util.ArrayList;
import java.util.*;

public class Problem_201 {

    public static void main(String[] args) {

        ArrayList<Integer> numberList= new ArrayList<>();
        System.out.println(appendPosSum(numberList));
    }


    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> numberList){

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9,8,-7,-6, 8,10, 11, 12));

        Integer sumOfPos = 0;
        for (Integer eachNumber : numbers) {
            if (eachNumber > 0) {
                //System.out.print(eachNumber + " "); //returns only positive numbers
                sumOfPos += eachNumber;
            }
        }

        //System.out.println("numbers of positive = " + sumOfPos);
        numbers.add(sumOfPos);

        ArrayList<Integer> finalNumbers = new ArrayList<>();
        for (Integer eachNumber: numbers) {
            if (eachNumber>0){
                finalNumbers.add(eachNumber);
            }
        }
        return finalNumbers;
    }
}








