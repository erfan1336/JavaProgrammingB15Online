package day33;

import java.util.Scanner;

public class NumberActions {

    public static void main(String[] args) {

        System.out.println(getSumFrom1toX());


    }

    /*
    create method called getSumFrom1toX
    This method should calculate the sum of the numbers form 1 to number user passed
    @param x the final number to be added
    @return the sum of the numbers from 1 to X;
     */

    public static int getSumFrom1toX(){

        //TODO: your code goes here

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= x ; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
