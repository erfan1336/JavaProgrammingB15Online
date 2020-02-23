package day29;

import java.util.Arrays;

public class FillingUpArrayValue {

    public static void main(String[] args) {

        int[] numbers = new int[100];
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

    }
}
