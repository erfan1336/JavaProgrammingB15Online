package repl_problems;
import java.util.Scanner;

/*
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa

 long max = salaries[0];

        for (long salary : salaries ) {
            if (salary > max){
                max = salary;
            }
        }

 */


public class P120_FindingMaxLengthInStringArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the strings: ");
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }

        String max = words[0];
        for (int i = 0; i < 5; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
        System.out.println("Longest word is = " + max);





//        String max = words[0];
//        for (int i = 0; i < 5; i++) {
//            for (String currentWord : words) {
//                if (currentWord.length() > max.length()) {
//                    max = currentWord;
//                }
//            }
//        }
//        System.out.println("Longest word is = " + max);






    }
}
