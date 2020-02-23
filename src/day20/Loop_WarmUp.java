package day20;

public class Loop_WarmUp {

    public static void main(String[] args) {

        // give me the sum of odd numbers from 10 to 100
        // odd numbers --> %2 == 1

        int sum = 0;
        int counter = 0;

        for (int i = 10; i <= 100 ; i++) {
            if (i %2 == 1){
                sum += i;
                counter++;
            }
        }
        System.out.println("Sum of the odd numbers is = " + sum);
        System.out.println("Number of odd number is = " + counter );
    }
}
