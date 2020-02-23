package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        String message = "   Repl is coming !   ";

        System.out.println(message);
        System.out.println("Message character length is: " + message.length());


        //trim method is used to take out spaces on two sides, not in between
        message = message.trim();
        System.out.println(message.trim());
        System.out.println("Message character length after trim is: " + message.length());

        System.out.println(message.isEmpty());

    }
}
