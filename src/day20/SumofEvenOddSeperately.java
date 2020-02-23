package day20;

public class SumofEvenOddSeperately {

    public static void main(String[] args) {

        int sumofEven = 0;
        int sumofOdd = 0;

        for (int i = 10; i < 100; i++) {
            //if its even number, add it to sumofEven
            if (i % 2 == 00){
                sumofEven = sumofEven +i;
                //if its odd number, add it to sumofOdd
            }else {
                sumofOdd = sumofOdd +i;
            }
        }

        System.out.println("Sum of Odd = " + sumofOdd);
        System.out.println("Sum of Even = " + sumofEven);
        System.out.println("Sum of Even + Odd = " + (sumofEven + sumofEven));
    }
}
