package repl_problems;

import java.util.Arrays;
import java.util.Scanner;

public class P141_Arrays_MakeLast {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the size of the array: ");
        int size = scan.nextInt();
        int[] nums = new int[size];


        System.out.println("please enter the array elements: ");

        //user input
        int i = 0;
        for (i = 0; i <size ; i++) {
            nums[i] = scan.nextInt();

        }
        //find last element
        //int lastNumber = nums[i-1];

        //System.out.println("last number = " + lastNumber);
        //System.out.println("last index number = " + lastIndex);

        int lastIndex = nums[nums.length-1];
        int[] newArray = new int[size*2];

        // if (eachWord.contains "
        // String tempSrting = eachWord;
        // String[] newArray = new String[tempString]


        //int temp = newArray.length -1;
        newArray[newArray.length -1] = lastIndex;
        System.out.println(Arrays.toString(newArray));


       // System.out.println(Arrays.toString(newArray));


       // System.out.println("last element in the array" + newArray[temp]);



        //System.out.println(temp);

      //  System.out.println("======================================");
        //creating new one with 2x length

//        for (i = 0; i < 2 * size-1  ; i++) {
//            System.out.print(Arrays.toString(newArray) );
//        }
//        System.out.println();




    }
}
