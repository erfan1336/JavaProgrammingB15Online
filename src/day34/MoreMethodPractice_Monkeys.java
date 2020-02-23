package day34;
import javax.print.DocFlavor;
import java.lang.String;

public class MoreMethodPractice_Monkeys {

    public static void main(String[] args) {

        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(true,false));
        System.out.println(monkeyTrouble(false,false));


        System.out.println(monkeyTrouble2(true,true));
        System.out.println(monkeyTrouble2(true,false));
        System.out.println(monkeyTrouble2(false,false));

    }


    /**
     * A method that return true only if both monkeys are smiling or not smiling
     * @param aSmile
     * @param bSmile
     * @return  true only if both monkeys are smiling or not smiling
     */
    public static boolean monkeyTrouble (boolean aSmile, boolean bSmile){

        //return aSmile == bSmile;  //first and best way

//        if ((aSmile && bSmile) || (!aSmile && !bSmile)){  // second and better way
//            return true;
//        }else{
//            return false;
//        }
        return (aSmile && bSmile) || (!aSmile && !bSmile);  // third solution that easy to understand and net
    }


    // Return yes or no instead of true and false
    public static String monkeyTrouble2 (boolean aSmile, boolean bSmile){
        if ((aSmile && bSmile) || (!aSmile && !bSmile)){  // second and better way
            return "Yes they smiling";
        }else{
            return "No they not smiling";
        }

    }



}
