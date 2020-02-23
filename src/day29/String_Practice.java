package day29;

import java.util.Arrays;

public class String_Practice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";

        //logic1 --> split this String by dash - to get 2 pieces of String into a String

        String[] heroSplited = hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString(heroSplited));

        //String heroCode = heroSplited[0];
        //String heroIdentity = heroSplited[1];

        System.out.println("hero code is = " + heroSplited[0] + "; identity is = " + heroSplited[1]);

        String fullName = "Erfan Hamit";

        String[] fullNameSplitted = fullName.split(" ");
        System.out.println("fullName Splietted = " + Arrays.toString(fullNameSplitted));

        String lastName = fullNameSplitted[fullNameSplitted.length-1];
        System.out.println("last name: " + lastName);

        System.out.println("Initials of full name: " + fullName.charAt(0) + lastName.charAt(0));





    }
}
