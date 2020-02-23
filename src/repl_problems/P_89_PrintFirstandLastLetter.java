package repl_problems;

import java.util.Scanner;

public class P_89_PrintFirstandLastLetter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the sentences: ");
        String input = scan.nextLine();
        int length = input.length();

        //for (int i = 0; i <input.length() ; i++) {
        System.out.print(input.charAt(0) +""+ input.charAt(length-1));



    }
}



//            char firstChar = input.charAt(0);
//            int length = input.length();
//            char lastChar = input.charAt(length-1);
//            System.out.println(firstChar +" "+  lastChar);