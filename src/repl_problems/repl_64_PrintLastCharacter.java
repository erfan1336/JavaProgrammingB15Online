package repl_problems;

import java.util.Scanner;

public class repl_64_PrintLastCharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String word = scan.nextLine();

        int lengthOfWord = word.length();
        System.out.println(word.charAt(lengthOfWord-1));

    }
}
