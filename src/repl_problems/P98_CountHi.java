package repl_problems;

import java.util.Scanner;

public class P98_CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        str = str.replace(" ","");

        System.out.println(str);

        int length = str.length();
        int counter = 0;

        for (int i = 0; i < length - 1 ; i++) {
            String wordHi = str.substring(i,i+2);
            if (wordHi.equals("hi")){
               counter++;
            }
        }
        System.out.println("Count of hi is =  " + counter);
    }
}
