package repl_problems;

import java.util.Scanner;

public class P113_Arrays_countOfEvenNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        int counter = 0;
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
            if (nums[i] % 2 ==0){
                counter++;
            }
        }
        System.out.println(counter);

    }
}
