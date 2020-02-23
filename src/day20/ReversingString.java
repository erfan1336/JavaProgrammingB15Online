package day20;

public class ReversingString {

    public static void main(String[] args) {

        /*
        given a string variable with value, revere this name and store reversed value into
        another string variable reversedName
         */

        String name = "Erfan Hamit Ablikim Awzer";
        String reversedName = "";

        int length = name.length();
        System.out.println("Length of the name is = " + length);

        //important to identify the real length of the last character address
        int lastCharIndex = name.length()-1;



        for (int x = lastCharIndex ; x >= 0; x--) {         //we can also replace the lastCharacter char to x

            System.out.print(x + " index : ");

            char currentChar = name.charAt(x);

            System.out.println(currentChar);

            reversedName = reversedName + currentChar;



        }

        System.out.println("Reversed name : " + reversedName);

    }
}
