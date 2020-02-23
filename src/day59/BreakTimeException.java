package day59;

public class BreakTimeException extends RuntimeException {

    //This is unchecked exception

}


class Main{
    public static void main(String[] args) {

        throw new BreakTimeException();
    }
}