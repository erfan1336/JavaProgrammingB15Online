package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        int x = 0;

        while (x < name.length()-1){
            if (x%2 == 1) {
                System.out.println("At index:"+ x + "-->" +name.charAt(x));
            }
            x++;
        }

    }
}
