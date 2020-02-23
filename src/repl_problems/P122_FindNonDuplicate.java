package repl_problems;
import java.util.Arrays;
import java.util.Scanner;

/*
 1123434
 0123456
 */

public class P122_FindNonDuplicate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 7 numbers: ");
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        int counter = 0;

        for (int j = 0; j <nums.length ; j++) {
            for (int i = 0; i <nums.length ; i++) {
                if (nums[j] == nums[i] ){
                    counter++;
                }
            }
            if (counter == 1){
                System.out.println("non duplicat number is: " + nums[j]);
            }
            counter = 0;
        }


        /*
        int counter = 0;

        for (int j = 0; j < nums.length-1; j++) {

            for (int i = j; i < nums.length-1; i++) {
                if (nums[j] == nums[i+1]) {
                    counter++;
                }
            }
            if (counter == 1){
                System.out.println(nums[j]);
            }
            counter = 0;
        }
         */

    }
}
