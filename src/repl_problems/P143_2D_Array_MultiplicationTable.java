package repl_problems;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class P143_2D_Array_MultiplicationTable {

    public static void main(String[] args) {
        int[][] multiplicationTable = new int[10][10];


        //TODO: type your code below
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1) ;
            }
        }
        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code

        System.out.println(Arrays.deepToString(multiplicationTable));
    }
}























