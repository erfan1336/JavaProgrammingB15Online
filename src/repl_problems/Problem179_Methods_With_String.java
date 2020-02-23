package repl_problems;

import java.util.Scanner;

public class Problem179_Methods_With_String {

    public static void main(String[] args) {

        //test your code
        System.out.println( uniqueChars("wooden-spoon") ) ;


    }

    public static String uniqueChars(String str){
        String result = "";

        // Scanner input = new Scanner(System.in);
        //String names = input.next();

        int counter = 0;

        for (int j = 0; j < str.length() ; j++) {

            for (int i = 0; i < str.length() ; i++) {
                char c = str.charAt(i);
               // System.out.print(c);

                if (str.charAt(i) == str.charAt(j)){
                    counter++;
                }
            }
        }

        System.out.println("counter is = " + counter);
        return result;
    }

}
