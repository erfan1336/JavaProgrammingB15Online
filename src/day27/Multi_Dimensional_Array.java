package day27;

import java.util.Arrays;

public class Multi_Dimensional_Array {
    public static void main(String[] args) {

        String[][] names = {{  "Erfan" ,"Hamit"  },  {  "Patigul", "Gulzar"  }  };

        //print Patigul:
        System.out.println(names[1][0]);

        //print Hamit
        System.out.println(names[0][1]);

        //print Hamit & Patigul
        System.out.println(names[0][1] +" "+ names[1][0]);


        int[][] numbers = {{1,2,3},{4,5,6}, {7,8,9},{10,11,12,23,26}};

        System.out.println(Arrays.toString(numbers[0]));

        System.out.println("===================================================");

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }

        System.out.println("-------------------------------------------------------");

        // 1 2 3 4 5 6 7 8 9 10 11 12 13
        for (int i = 0; i < numbers.length ; i++) {  //check each index of two dimensional array

            for (int j = 0; j < numbers[i].length ; j++) {   //----------> make sure the J scope

                /*
                if (numbers[i][j] % 2 !=0){
                    continue;
                }
                */

                // print all the even numbers
                if (numbers[i][j] %2 ==0)

                System.out.println(numbers[i][j] + " ");
            }

        }

        System.out.println("\n ========================For Each Loop=================");
        int[] arr1D = {1,2,3};

        for (int eachElement : arr1D){
            System.out.print(eachElement + " ");
        }

        System.out.println("\n =============== For Each Loop For 2 Dimensional Array ===============");
        int[][] arr2D = {{10,20,30}, {40,50,60,70,80,90,100}};

        for (int[] each1DArray : arr2D){           //variable each1DArray represents each index of 2d array
            for (int eachElement : each1DArray) {    //variable eachElement represents each element in each1DArray
                System.out.print(eachElement + " ");
            }
        }


    }
}
