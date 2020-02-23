package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {

        //how to get the size of any array object
        //array object has a property called length

        int[] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // accessing the elements inside the array one by one
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);
//
          //int itemCount = scores.length;


        //how do we get the char count of a String
//        String name = "Jon Snow";
//        int charCount = name.length();




        System.out.println("---------------Print Out with loop-----------------------");

        int itemCount = scores.length;
        int lastItemIndex = itemCount-1;


       // for (int x = 0; x <=  lastItemIndex; x++)
       // for (int x = 0; x <= itemCount -1 ; x++)
       // for (int x = 0; x < itemCount; x++){

        for (int x = 0; x < itemCount; x++){
            System.out.println(scores[x]);
        }


        String[] names = new String[5];

        names[0] = "Hamit Ablikem";
        names[1] = "Patigul Mamat";
        names[2] = "Gulzar Hamit";
        names[3] = "Erfan Hamit";
        names[4] = "Guldane Hamit";

        int countOfName = names.length;
        int lastIndexOfNames = countOfName - 1;
        for (int i = 0; i < names.length; i++){
            //String name = names[i];
            System.out.println(names[i]);
        }


    }
}
