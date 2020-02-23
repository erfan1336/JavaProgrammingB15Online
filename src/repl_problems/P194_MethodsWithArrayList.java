package repl_problems;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class P194_MethodsWithArrayList {

    public static void main(String[] args) {

//        ArrayList result = new ArrayList<String>();
//        System.out.println(result);


        System.out.println(test(new ArrayList<String>()));



        //Call the second way
        ArrayList<String> words = new ArrayList<>();
        anotherTest(words);

    }

    //create the Arrays list with Void Method
    public static void anotherTest(ArrayList<String> words) {
            //write code here
            words.add("arrrt");
            words.add("attt");
            words.add("ttat");
            words.add("tta6yt");
            words.set(1, "hey");
            words.set(3, "yo");
            System.out.println(words);
    }


    //one way to create the method
    public static List<String> test(List<String> words){

            words.add("Orange");
            words.add("Apple");
            words.add("Banana");
            words.add("Pearls");
            words.add("WaterMellon");

            words.set(0,"git");
            words.set(2,"gud");

            return words;
    }


}

