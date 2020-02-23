package repl_problems;

import java.util.Scanner;

public class P93_HasJava {
    public static void main(String[] args) {
        boolean exists = false;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the word: ");
        String word = scan.next();

        int length = word.length();

        /////////////xdfJAVAmynameis
        ///if (0,3) -->java
        ///if (1,4) -->java

        //for (int i = 0; i < length; i++) {


            if (word.substring(0,3).equals("java") || word.substring(1,4).equals("java")) {
                System.out.println("True");
            }else{
                System.out.println("False");
            }
       // }


    }

}
