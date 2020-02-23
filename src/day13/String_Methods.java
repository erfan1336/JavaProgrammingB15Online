package day13;

public class String_Methods {
    public static void main(String[] args) {

        //String actions that we already learned
        // equals
        // equalsIgnoreCase

        String s1 = "hello";
        String name = "Erfan Hamit  ";

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toUpperCase());

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        int lengthofString = name.length();
        if (lengthofString > 4){
            System.out.println("More than 4 character");
        }else {
            System.out.println("not more than 4 character");
        }



    }
}
