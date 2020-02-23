package repl_problems;

import javax.naming.PartialResultException;
import java.util.Scanner;


public class P152_Methods7_Plus_Minus {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size - 1; i++) {
            arr[i] = inp.nextInt();
        }



        plus_minus(arr);

    }

    public static int plus_minus(int[] array){

        int postiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        int counter = 0;

        for (int eachNumber: array) {
            if (eachNumber > 0){
                postiveCounter++;
            }else if (eachNumber < 0){
                negativeCounter++;
            }else if (eachNumber == 0){
                zeroCounter++;
            }
        }

        return counter;


    }
}
