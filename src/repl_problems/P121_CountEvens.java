package repl_problems;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Given an array nums, calculate count of even numbers in nums
(not their values!) and print out to console.
 */
public class P121_CountEvens {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int counter = 0;

        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println("count of even numbers = " + counter);

    }
}
