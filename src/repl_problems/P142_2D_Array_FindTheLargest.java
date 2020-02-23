package repl_problems;

import java.util.Scanner;

public class P142_2D_Array_FindTheLargest {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the rows: ");
        int row = inp.nextInt();

        System.out.println("Please enter the columns: ");
        int col = inp.nextInt();

        System.out.println("Please enter the array elements: ");
        int[][] arr = new int[row][col];

        //user input and store
        for (int i = 0; i <= row - 1 ; i++) {
            for (int j = 0; j <= col -1 ; j++) {
                arr[i][j] = inp.nextInt();
            }
        }

        for (int i = 0; i <= row - 1 ; i++) {
            for (int j = 0; j <= col -1 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int maximumNum = arr[0][0];

        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= col - 1; j++) {
                if (arr[i][j] > maximumNum){
                    maximumNum = arr[i][j];
                }
            }
        }
        System.out.println("largest number is = " + maximumNum);



    }
}
