package day18;

public class For_Loop_Intro {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println("Happy Birthday!");
        }

        for (int counter = 10; counter > 0; counter--) {
            System.out.println("counter " + counter);
        }

        for (int i = 0; i <= 100; i += 5) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Even Number: ");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("----------------------------");


    }

}
