package day20;

public class FindDogInSentences {
    public static void main(String[] args) {

        /*
          given sentence --> find out the location of the dog

          approach is going through the sentences 3 character at a time, then if these 3 character
          happened to be the dog, then print out the index
         */
        //            01234567890123456789012345678901234567890123
        String msg = "I like dog, dogs are cure, dogs are friendly";
        int length = msg.length();

        int lastCharIndex = msg.length()-1;


        for (int x = 0; x < length - 2; x++ ){

            String current3Chars = msg.substring(x, x+3);
            System.out.println(x + " : " + current3Chars);
          //if msg.substring(x,x+3).equals("dog")
            if (current3Chars.equals("dog")){
                System.out.println("Bingo!!! At :" + x);
            }
        }


    }
}
