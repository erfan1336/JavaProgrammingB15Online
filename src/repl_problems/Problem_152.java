package repl_problems;

import java.util.Scanner;

public class Problem_152 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i <= size -1; i++){
            arr[i] = inp.nextInt();
        }

        plus_minus(arr);

    }

    public static void plus_minus(int[] arr){

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int eachNumber : arr) {

            if (eachNumber > 0){
                positiveCount++;
            }else if (eachNumber < 0){
                negativeCount++;
            }else if (eachNumber == 0){
                zeroCount++;
            }
        }
        System.out.println(positiveCount);
        System.out.println(negativeCount);
        System.out.println(zeroCount);

    }
}
