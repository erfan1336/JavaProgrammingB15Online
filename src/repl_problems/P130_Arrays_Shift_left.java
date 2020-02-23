package repl_problems;

import java.util.Arrays;
import java.util.Scanner;

public class P130_Arrays_Shift_left {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < size ; i++) {
            nums[i] = scan.nextInt();
        }

        //write your code below;


        int temp = nums[0];

        for (int i = 0; i < size-1; i++) {
            nums[i] = nums[i+1];
        }

        for (int i = 0; i < size-1; i++) {
            nums[size-1] = temp;
        }

        System.out.println(Arrays.toString(nums));


            // 6 , 2, 5 , 3
            // 2   5  3   6

            // 6 = a[0]  -->a[last]
            // 2 = a[1]  -->a[0]
            // 5 = a[2]  -->a[1]
            // 3 = a[3]  -->a[2]



    }
}
