package repl_problems;

import java.util.Scanner;

public class P128_AverageTemp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        System.out.println("Please enter the temperatures: ");
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
//
//        for (int i = 0; i< temps.length; i++ ){
//            total = total + temps[i];
//            avgTemp = total/i;
//
//        }

        while (k < temps.length){
            total = total + temps[k];
            avgTemp = total/k;
            k++;
        }

        System.out.println("Sum of the temperatures = " + total);
        System.out.println("Average temp = " + avgTemp);

    }
}
