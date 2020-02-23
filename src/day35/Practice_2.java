package day35;

import java.util.Arrays;

public class Practice_2 {
    public static void main(String[] args) {

        String Erfan = "1,5,Love,10";

        String asat = "1235";
        int num23 = Integer.parseInt(asat);
        System.out.println("num23 = " + num23);

        String[] Array = Erfan.split(",");

        int sum = 0;
        for (int i = Integer.parseInt(Array[0]); i <= Integer.parseInt(Array[Array.length-1]); i++) {
            System.out.print(i + " ");
            sum = sum +i;
        }
        System.out.println();
        System.out.println("sum = " + sum);



    }
}
