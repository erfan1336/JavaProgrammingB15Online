package repl_problems;

import java.util.Scanner;

public class P114_FindSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 numbers: ");
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // yes above code will ask user 5 numbers while creating an array
        // just assume that you have int array with 5 numbers and start working on requirement
        // loop through the array and get the sum of the numbers
        //TODO: Write your code below
//        int sum =0;
//        for (int i = 0; i <nums.length ; i++) {
//            sum = sum + nums[i];
//        }
//        System.out.println("Sum of the numbers is = " +sum);

        //Use For Each Loop  -------------------------------------------------------------------------------

        int sumOfNumbers = 0;
        for (int numbers : nums) {
            sumOfNumbers = sumOfNumbers + numbers;
        }
        System.out.println("Sum of numbers = " + sumOfNumbers);

    }
}
