package day05;
import java.util.Scanner;

public class ScannerPractise_Boolean {
    public static void main(String[] args) {

        //Create scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Are you recording? ");

        boolean isRecording = input.nextBoolean();

        System.out.println("We are recording " + isRecording);


    }
}

