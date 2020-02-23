package day17;

import java.util.Scanner;

public class ReversePrintString {
    public static void main(String[] args) {
                       //01234567890         index = count -1
       // String name = "Erfan Hamit";
                       //12345678901         count = name.length()

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name: ");
        String name = scan.nextLine();


        int x = name.length()-1;

        while (x >= 0){
            System.out.println("index " + x + " : " + name.charAt(x));
            --x;
        }



    }
}
