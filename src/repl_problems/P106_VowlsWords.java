package repl_problems;

import java.util.Scanner;
/*
   oueai

   whatadayfor
   01234567890

 */

public class P106_VowlsWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String input = scanner.nextLine();

        int length = input.length();

        System.out.println(input.charAt(0));
        System.out.println(input.charAt(2));
        System.out.println(input.substring(0,1));
        System.out.println(input.substring(1));
        System.out.println(input.substring(2));
        if (input.substring(0,1).contains("w")){
            String str2 = input.substring(0,1);
            System.out.println("here is the " + str2);
        }

//        for (int i = 0; i < length ; i++) {
//
//            if (str.substring(i,i+1).contains("u") || str.substring(i,i+1).contains("o")
//            || str.substring(i,i+1).contains("v") || str.substring(i,i+1).contains("a") ||
//                    str.substring(i,i+1).contains("i") ||  str.substring(i,i+1).contains("e")){
//                System.out.print(str.substring(i,i+1) + "");
//            }
//
//        }


        //int length = input.length();
        for (int x = 0; x <= length - 1; x++) {

            //this is the most import part that need to assign the char value to char sting
            char c = input.charAt(x);
            if (c == 'a' || c == 'o' || c == 'u' || c == 'i' ||
                    c == 'e') {
                System.out.print(c + "");
            } else {
                System.out.print("");
            }
        }


    }
}
