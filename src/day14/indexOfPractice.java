package day14;

public class indexOfPractice {
    public static void main(String[] args) {

        //index of
        //find out index of another string inside another string
                  //   0123456789012345
        String name = "The Game of Java";

        //find out the location of Java
        System.out.println(name.indexOf("Java"));

        //find out the location letter o
        System.out.println(name.indexOf("o"));

        //find out the location of first first space
        System.out.println(name.indexOf(" "));

        System.out.println("Location of first letter A: " + name.indexOf("a"));
    }
}
