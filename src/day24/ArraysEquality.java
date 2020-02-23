package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        int[] scores1 = {2,5,6,7,8,3,45};
        int[] scores2 = {22,45,56,34,2,6,9,6};
        int[] scores3 = {2,5,6,7,8,3,45};
        int[] scores4 = {2,6,5,8,7,45,3};


        System.out.println(scores1 == scores2);
        System.out.println(scores1 == scores3);

        boolean isS1S2Equals = Arrays.equals(scores1,scores2);

        System.out.println(isS1S2Equals);

        boolean isS1S3Equals = Arrays.equals(scores1,scores3);

        Arrays.sort(scores3);
        Arrays.sort(scores4);

        boolean isS3S4Equals = Arrays.equals(scores3,scores4);
        System.out.println("After sorting, S3 and S4 equals? : " + isS3S4Equals);

     }
}
