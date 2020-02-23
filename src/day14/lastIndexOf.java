package day14;

public class lastIndexOf {
    public static void main(String[] args) {

        //find out index of another string inside another string
        //             0123456789012345
        String name = "The Game of Java";

        System.out.println("Find last location of letter a: " + name.lastIndexOf("a"));
        System.out.println("Location of last character space: " + name.lastIndexOf(" "));
        System.out.println("Location of letter Ga show up: " + name.lastIndexOf("Ga")) ;
        System.out.println("Location of letter Kawa: " + name.indexOf("Kawa"));

        if (name.indexOf("Kawa") > -1){
            System.out.println("Kawa is found");
        }else {
            System.out.println("No Kawa found");
        }


    }
}
