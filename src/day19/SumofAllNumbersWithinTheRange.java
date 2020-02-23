package day19;

public class SumofAllNumbersWithinTheRange {
    public static void main(String[] args) {

        //get the sum of numbers from 1-10
        //sum = sum + 1
        //sum = sum + 2

        //sum = sum + i

        int sum = 0;

        for (int i = 1; i < 10; i++) {
           sum = sum + i;
           //System.out.println(sum);
        }
        System.out.println(sum);


        //Homework --> create program to ask user two number and add numbers within these range
    }
}
