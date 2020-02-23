package day13;

public class moreStringPractices {
    public static void main(String[] args) {
        String name = "Erfan";
        System.out.println(name);

        name = "Hamit";
        System.out.println(name);
        // check if string with start with another string --> startwith
        //its case sensitive
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.startsWith("ha"));

        //endwith function
        System.out.println(name.endsWith("it"));



    }
}
