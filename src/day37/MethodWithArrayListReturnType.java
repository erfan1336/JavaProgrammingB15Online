package day37;

import java.util.ArrayList;
import java.util.List;


public class MethodWithArrayListReturnType {

    public static void main(String[] args) {

        System.out.println( getListFrom1TillFinalNumber(35));

        List<Integer> blablalist = getListFrom1TillFinalNumber(18);
        System.out.println("mylist = " + blablalist);

    }

    //create a method that accept a finalNumber as int
    //return an ArrayList of Integer containing numbers starting from 1 till final number

    /**This method will return a List of Integer that containing numbers tarting from 1 till final number
     *
     * @param finalNumber This is the last time of the list
     * @return List<Integer> that contains 1 till final numbers increased by 1
     */


    public static List<Integer>getListFrom1TillFinalNumber(int finalNumber){

        List<Integer> nums = new ArrayList<>();

        for (int numbers = 1; numbers <= finalNumber; numbers++) {
            nums.add(numbers);
        }
        //System.out.println("nums" + nums);
        return nums;
    }

}

