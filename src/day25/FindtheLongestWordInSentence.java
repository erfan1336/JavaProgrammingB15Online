package day25;

import java.util.Arrays;

public class FindtheLongestWordInSentence {

    public static void main(String[] args) {
        String sentence = "We are tying to find the longest word in the sentencessssss ";

        String[] allWords = sentence.split(" ");
        System.out.println("allwords" + Arrays.toString(allWords));


        String longestWord = allWords[0];


        for (String currentWord: allWords) {

            if (currentWord.length() > longestWord.length()){
                longestWord = currentWord;
            }
        }
        System.out.println("logestWord is = " + longestWord);

    }
}
