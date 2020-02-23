package day17;

public class Odd_Even_withintheRange {
    public static void main(String[] args) {

        // write a program to print out a even number from 0 to 50
        // write a program to print out a odd number from 0 to 50

        int counter = 0;

        while(counter <= 50){
            System.out.print(counter + " ");
            counter += 2;
        }

        System.out.println("---------------------------------");
        int counter2 = 1;

        while (counter2 < 50){
            System.out.print(counter2 + " ");
            counter2 += 2;
        }

        System.out.println("---------------------------------");


        int counter3 = 0;
        if (counter3 %2 == 0){
            System.out.println( counter3 + " is even number. ");
        }else
            System.out.println(counter3 + " is odd number. ");

        System.out.println("////////////////////////////////////////");

        while (counter3 <=50){
            if (counter3 % 2 == 0){
                System.out.println(counter3 + " is even number.");
            }else {
                System.out.println(counter3 + " is odd number");
            }
            ++counter3;
        }
    }
}
