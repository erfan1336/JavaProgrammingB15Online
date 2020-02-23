package day20;

public class PalindromeTest {
    public static void main(String[] args) {
        /*
        if you reverse a String, and if it does Not change it means the string is called Palindrome

        level, kayak , elle , madam, aziza

         */

        String name = "kayak";
        String reversedName = "";

        for (int i = name.length()-1 ; i >= 0 ; i--) {
            reversedName = reversedName + name.charAt(i);
        }

        System.out.println("Original Name: " + name);
        System.out.println("Reversed Name: " + reversedName);

        //check weather reversed name is equal without case sensitivity
        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed ");
        }else {
            System.out.println("Palindrom test has failed");
        }

    }
}
