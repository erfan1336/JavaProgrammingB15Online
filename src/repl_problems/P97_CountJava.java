package repl_problems;

import java.util.Scanner;

public class P97_CountJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String word = scan.nextLine();

        //123456789012345678  length = 17
        //javakavaxjavakava   //= 8
        //01234567890123456  index = (0 - 16)

        //12345678
        //javakava
        //01234567

        int length = word.length();  // = 17
        int indexOfLastChar = length - 1;  //16
        int counter = 0;

        for (int i = 0; i <= length-4   ; i++){
           // String wordJava = word.substring(i, i + 4);
            if ( word.substring(i, i + 4).equals("java")) {
                counter++;
            }
        }
        System.out.println("Output: " + counter);

        //ERFANHAMIT
        //0123456789
        //substring(0,4) -->
        //substring(1,5)--->


    }

    /*
          java is the jav ablikem java
          0123456789012345678901234567
     */
}
