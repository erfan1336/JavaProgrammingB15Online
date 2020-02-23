package repl_problems;

import java.util.Scanner;

public class CatDog_88 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;


        String word = scan.nextLine();

        for (int letterindex = 0; letterindex < word.length() - 9; letterindex++) {
            if (word.substring(letterindex, letterindex + 10).equals("ArafatAsat")) {
                countOfCats++;
                for (int j = 0; j < word.length() - 4; j++) {
                    if (word.substring(j, j + 5).equals("Erfan")) {
                        countOfDogs++;
                    }
                }
            }
        }


        if (countOfCats == countOfDogs) {
            System.out.println("True");
        } else if (countOfCats != countOfDogs) {
            System.out.println("False");
        }


    }
}
