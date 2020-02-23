package Other;

import java.util.Arrays;

public class findtheNumbersEqualto {

    public static void main(String[] args) {

        //fin the pair of numbers that sum is equal to 10

        int[] array = {2,4,6,8,4,9,10,3,5,12,};

//        int counter =0;
//        for (int eachNumber : array) {
//            for (int anotherEach : array)
//            if (eachNumber + anotherEach == 8){
//                counter ++;
//                System.out.println(eachNumber);
//                System.out.println(anotherEach);
//                System.out.println("==========================");
//            }
//        }




        for (int j = 0; j < array.length; j++) {
            for (int i = j+1; i < array.length; i++) {
                 if (array[j] + array[i] == 8) {
                    System.out.println(array[j]);
                    System.out.println(array[i]);
                    System.out.println("=============================");

                }
            }

        }

    }
}
