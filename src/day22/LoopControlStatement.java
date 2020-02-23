package day22;

import java.util.Scanner;

public class LoopControlStatement {
    public static void main(String[] args) {

        String msg = "Erfan Hamit is cool guy, he loves java, he codes in java and sometimes have fun in java";

        for (int i = 0; i < msg.length(); i++) {
            if (i % 2 == 1) {
                continue;
            }
            String currentChar = msg.substring(i, i + 1);

            if (currentChar.equalsIgnoreCase("J")){
                break;
            }
            System.out.println(i + " index of " + " current char " + currentChar);
        }
    }

}
