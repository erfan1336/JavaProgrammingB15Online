package day21;

public class OddNumberPrintRepitition {
/*
count from 1-10 --> print out only odd Numbers
repeat this 4 times
 */
    public static void main(String[] args) {


        for (int j = 0; j < 4; j++) {
            System.out.println("Iteration is: " + j );

            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        }




    }
}
