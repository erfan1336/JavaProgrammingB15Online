package day27;

import java.util.Arrays;

public class Multi_DimensionalArray_3D {

    public static void main(String[] args) {

        //2D Array : contains 1D array

        int [][]  arry2D = { {1,2,3},  {4,5,6} };

        // 3D Array : contains 2D array
        int[][][] arr3D = {   {{1,2,3},{4,5,6}} , {{7,8,9},{10,11,12}}    };
        //     k                0 1 2   0 1 2       0 1 2    0 1  2
        //     j                   0       1            0       1
        //     i                       0                   1
        //int [i][j][k]

        //print 9:
        System.out.println(arr3D[1][0][2]);

        //print 2:
        System.out.println(arr3D[0][0][1]);

        //print {1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0]));

        //print{10,11,12}
        System.out.println(Arrays.toString(arr3D[1][1]));

        //print{{7,8,9},{10,11,12}}
        System.out.println(Arrays.deepToString(arr3D[1]));  //toSring does Not work here

        //print {{1,2,3},{4,5,6}} , {{7,8,9},{10,11,12}}
        System.out.println(Arrays.deepToString(arr3D));

        System.out.println("=================== Print Out With For Loop ==========================");
        for (int i = 0; i < arr3D.length ; i++) {   // i --> each index of 2D array
            for (int j = 0; j <arr3D[i].length ; j++) {   //j --> each index of 1D array
                for (int k = 0; k < arr3D[i][j].length; k++) {  // k --> each index of each elements

                    System.out.print(arr3D[i][j][k] + " ");     //return values
                }
            }
        }


    }
}
