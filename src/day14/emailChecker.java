package day14;

public class emailChecker {

    public static void main(String[] args) {

        String email = "Erfan@gmail.com";

        boolean containAtSign = email.contains("@");
        boolean containsSpace = email.contains(" ");
        boolean endWithGmail = email.endsWith("@gmail.com");
        boolean endWithYahoo = email.endsWith("@yahoo.com");
        boolean endWithRussian = email.endsWith("@mail.ru");

        if (containAtSign && (!containsSpace)){
            System.out.println("Valid Email");
            if (endWithGmail){
                System.out.println("It is Gmail");
            }else if (endWithYahoo){
                System.out.println("Its is yahoo email");
            }else if (endWithRussian){
                System.out.println("Its Russian email");
            }

        }else if (containsSpace){
            System.out.println("Invalid Email");
        }

    }
}



