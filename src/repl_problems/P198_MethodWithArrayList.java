package repl_problems;

import java.util.ArrayList;

public class P198_MethodWithArrayList {
    public static void main(String[] args) {

        System.out.println((new ArrayList<String>()));

    }

    public static ArrayList<String> combineAL (ArrayList<String> wordList1, ArrayList<String> wordList2){

        ArrayList<String> words = new ArrayList<>();
        words.addAll(wordList1);
        words.addAll(wordList2);
        return words;
    }
}
