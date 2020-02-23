package day21;

public class SearchingSomethingInString3character {

    public static void main(String[] args) {

        String myName = "ErfanErfanErf";
        int lengthmyName = myName.length();

        /*
        Find out index of all the letter "a" in case insensitive manner
        Use for loop to go through every letter of the string
        While i am going through each and every character
          -->i will check whether current character i am looking for
          --> if equals to "a" or "A"  -->>> currentCharacter.equalIgnoreCase("a")
          --> if it is, will print out the index  --->> (the variable used to keep the index)
          --> if not, just move to next

        ->>>>Perform this until i reach last character

         */
        int counter = 0;
        for (int i = 0; i < lengthmyName-2; i++) {
            String currentCharacter = myName.substring(i,i+3);
            if (currentCharacter.equalsIgnoreCase("ERF")){
                System.out.println("Index of character 'ERF' or 'erf' = " + i);
                counter++;
            }
        }
        System.out.println("counter is = " +counter);


    }
}
