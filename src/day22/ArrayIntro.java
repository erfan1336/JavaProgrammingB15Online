package day22;

public class ArrayIntro {

    public static void main(String[] args) {

        //Syntax for creating variable to store single item and assigning value
        // dataType variable = value here
        int num1 = 10;

        //Syntax for creating variables to store multiple items and assigning value
        // dataType variable = value here
        // dataType [] variableName = new dataType [count of item];
        // Array size = count of item

        int[] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // accessing the elements inside the array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        //update the value at certain index
        scores[1] =99;
        System.out.println(scores[1]);

        // Once array is created with certain size, we Can NOT Change the size!!!!!!!!!!!!

        int[] numbers = new int[3];
        // print out Default value,
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // create a byte array in size = 4, and store it into a variable called data
        // assign value for each index location, print out values at each index
        // update last index value, then print it out

        byte[] data = new byte[4];
        System.out.println(data[0]);
        data[0] = 108;
        data[1] = 100;
        data[2] = 102;
        data[3] = 98;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

    }
}
