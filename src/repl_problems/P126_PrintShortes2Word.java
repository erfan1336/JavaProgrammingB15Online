package repl_problems;

import java.util.Arrays;
import java.util.Scanner;

public class P126_PrintShortes2Word {

    public static void main(String[] args) {

        // olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
        //w[0]   w[1]    w[2]     w[3]     w[4]   w[5]   w[6]   w[7]

        // w[0] + w[1] + w[8]



        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] allWords = str.split(",");
        System.out.println(Arrays.toString(allWords));

        String shortestWord = allWords[0];

        //  String[] wordSplitted = allWords.;

        String secondShortest = allWords[0];
        String thirdShortest = allWords[0];

        int counterOfCurrentWord = 0;

        for (String currentWord : allWords) {
            if (currentWord.length() < shortestWord.length()) {

                shortestWord = currentWord;
                System.out.println(shortestWord);
                counterOfCurrentWord++;

                int lengthOfShortestWord = shortestWord.length();

            }

        }


//        int counter = 0;
//        String secShortest = " ";
//        String thirShortest = "";
//        int lengthOfTheShortest = 0;

//            for (int i = 0; i < allWords.length; i++) {
//                if (shortestWord.length() > allWords[i].length() ){
//
//                    shortestWord = allWords[i];
//                    lengthOfTheShortest = allWords[i].length();
//                    counter++;
//
//                    for (String eachWord : allWords){
//                        if (eachWord.length() == lengthOfTheShortest){
//                            secShortest = eachWord;
//                        }
//                    }
//
//                    for (String eachWord : allWords){
//                        if (eachWord.length() <= lengthOfTheShortest){
//                            thirShortest = eachWord;
//                        }
//                    }
//
//                }
//
//
//            }
//        System.out.println(shortestWord);
//        System.out.println(secShortest);
//        System.out.println(thirShortest);





    }
}

