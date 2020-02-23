package repl_problems;

import java.util.Scanner;

/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal
to the number of appearances of "python" anywhere in the string (case sensitive).
 */

public class P101_JavaAndPython {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the sentence: ");
        String str = scan.nextLine();
        int lengthStr= str.length();
        int counterJava = 0;
        int counterPython = 0;

        /*
        1234
        java
        0123

        123456
        python
        012345

         */

        for (int i = 0; i < lengthStr - 3; i++) {
            if (str.substring(i,i+4).equals("java")){
                counterJava++;
            }
        }

        for (int i = 0; i < lengthStr - 5; i++) {
            if (str.substring(i,i+6).equals("python")){
                counterPython++;
            }
        }

       boolean result = (counterJava == counterPython)? true:false;
        System.out.println(result);



    }
}
