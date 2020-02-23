package repl_problems;

import java.util.Scanner;

public class P144_Array_match2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("please enter the number of rows: ");
        int rows = inp.nextInt();

        System.out.println("Please enter the number of columns: ");
        int cols = inp.nextInt();

        System.out.println("Please enter the array below: ");
        int[][] arr = new  int[rows][cols];



        //user input
        for (int i = 0; i <= rows -1 ; i++) {
            for (int j = 0; j <= cols -1 ; j++) {
                    arr[i][j] = inp.nextInt();
            }
        }


        //print the array
        for (int i = 0; i <= rows -1 ; i++) {
            for (int j = 0; j <= cols -1 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        //code here:

        int matches = 0;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols -1 ; j++) {

                //if x[0][0] == x[0][1]
                //if x[1][1] == x[1][2]
                //if x[2][3] == x[2][4]

                if (arr[i][j] == arr[i][j+1]){
                    matches++;
                }
            }

        }

        System.out.println("matches = " + matches);


    }
}


/*
[2,2,1,3,4,5]
[5,2,3,3,4,5]
[3,2,3,1,4,5]

3
3
2
2
1
1
3
3
7
8
8
 */