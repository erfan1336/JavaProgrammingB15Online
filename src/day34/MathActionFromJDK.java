package day34;
import java.lang.String;

public class MathActionFromJDK {

    public static void main(String[] args) {

        //where is String class coming from?
        //it is coming from a package called java.lang
        //it is a special package
        //
        //what if i really want to explicitly import String class
        //import java.lang.String

        int sum = Math.addExact(10,20);
        System.out.println(sum);


    }
}
