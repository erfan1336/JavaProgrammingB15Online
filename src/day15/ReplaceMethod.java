package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

        //replace the word with one-another
        //it will go through all part of the String and replace

        String message = "I Love Pumpkin, Pumpkin is FUN!";

        message = message.replace("Pumpkin", "Java");
        System.out.println(message);



        String message2 = "Happy Thanks Giving to ALL!!";
        //--->> "Happy thanksgiving to all!!"

        message2 = message2.replace("Thanks Giving", "thanksgiving");
        System.out.println(message2);

        //what if i want to replace space from everywhere?
        message2 = message2.replace(" ","");
        System.out.println(message2);
    }
}
