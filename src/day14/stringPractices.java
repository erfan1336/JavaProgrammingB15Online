package day14;

public class stringPractices {
    public static void main(String[] args) {

        String str = "I like Pumpkin";

        System.out.println(str.equals("pumpkin"));

        //contains
        System.out.println("Does it contains?: " + str.contains("ump"));
        
        // store the result as boolean
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println(gotPumpkin);

        // Shortcut to print variable value in nice format
        System.out.println("gotPumpkin = " + gotPumpkin);

        //StartsWith EndsWith

        boolean startWith = str.startsWith("I");
        System.out.println("startWith = " + startWith);

        boolean endWith = str.endsWith("kin");
        System.out.println("endWith = " + endWith);

        //Password Validator

        String password = "Ab_12321$12csa";

        //Mininum 8 CHAR, max 16 CHAR
        boolean min8Max16 = password.length() >= 8 && password.length() < 16;

        //it must contains _ OR $
        boolean mustContains_or$ = password.contains("_") || password.contains("$");

        //it must not contains SPACE
        boolean notContainsSpace = !password.contains(" ");

        //it must start with Ab
        boolean startWithAB = password.startsWith("Ab");

        // if any of above condition does not match --> invalid password, else good password


        if (min8Max16 && mustContains_or$ && notContainsSpace && startWithAB){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }


    }
}
