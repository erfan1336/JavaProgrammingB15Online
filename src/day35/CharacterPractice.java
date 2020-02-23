package day35;

public class CharacterPractice {

    public static void main(String[] args) {

        //Character class has lots of static methods
        //to perform actions on char values
        //isDigit, isLetter, isLetterOrDigit, isUpperCase, isLowerCase, toUpperCase, toLowerCase

        String str ="A34B123C4X";

        //GET THE NUMBER OUT OF THIS STRING
        // and store it into Integer variable x;

        String numsInStr = "";

        for (int x = 0; x < str.length(); x++){

            if (Character.isDigit(str.charAt(x))){
                System.out.println(" str.charAt("+ x +") = " + str.charAt(x));
                //appending number character to the result numIntStr
                numsInStr = numsInStr + str.charAt(x);
            }
        }

        System.out.println("numsInStr = " + numsInStr);

        Integer num = Integer.valueOf(numsInStr);

        int num1 = Integer.parseInt(numsInStr);


        System.out.println("num = " + num);
        System.out.println("num1 = " + num1);
    }
}
