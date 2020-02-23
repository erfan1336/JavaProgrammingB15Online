package repl_problems;

public class P64_MiddleOne {

    public static void main(String[] args) {

        /*
      1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

      2. When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi

      my logic --> if single character  --> print the character 3 times
               -->  if two character   -->  print those 2 characters twice
               --> if odd number of characters and 3 or more characters --> get the middle one : lengthofword/2


               if even number of characters and 4 or more characters --> print middle 2
         */

        String word = "ab";
        int charCount = word.length();

        if (charCount ==1 ){
            System.out.println(word+word+word);
        }else if (charCount == 2){
            System.out.println(word+word);
        }else if (charCount > 2){
            //if the word character count more than 2, then if its even or odd
            if (charCount % 2 == 1){
                System.out.println(word.charAt(charCount/2));
            }else {
                int indexOfFirstHalf = charCount/2 -1;
                int indexOfSecondHalf = charCount/2;
                System.out.println(word.charAt(indexOfFirstHalf) + "" + word.charAt(indexOfSecondHalf));
            }

        }


    }
}
