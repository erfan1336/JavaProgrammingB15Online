package repl_problems;
import java.lang.String;

public class Problem_169 {

    public static void main(String[] args) {

        System.out.println(threeLocks(true,false,true));

    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        return (a && b) || ((a && b) || c);

    }//end threeLocks


}
