package day26;

import java.util.Scanner;

public class Swapping_Practice {

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);

        int[] myNumbers = new int[]{33,22,44,55,44, 22};

        int[] yourNumbers = {232,343,454,666};

        int temp = yourNumbers[3];
        yourNumbers[3] = myNumbers[0];
        myNumbers[0] = temp;


        for (int i = 0; i <myNumbers.length ; i++) {
            System.out.println("my numbers : " + myNumbers[i]);
        }

        for (int eachnumber : yourNumbers) {
            System.out.println("your numbers : " + eachnumber);
        }


        int[] herNumbers = new int[4];

        herNumbers[0] = 22;
        herNumbers[1] = 33;
        herNumbers[2] = 44;
        herNumbers[3] = 55;

        String name1 = "Erfan";
        String name2 = "Hamit";


        String tempName = name1;
        name1 = name2;
        name2 = name1;

        System.out.println("After swap --> name1: "+name1 + "  name2: "+name2);



    }
}
