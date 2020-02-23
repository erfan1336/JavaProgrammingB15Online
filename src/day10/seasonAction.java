package day10;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class seasonAction {

    public static void main(String[] args) {
        String season = "Winter";

        switch (season) {
            case "Winter" :
                System.out.println("Snowbording, Ski, Chrismas");
                break;
            case "Summer" :
                System.out.println("Fun time");
                break;
            case "Spring":
                System.out.println("Rain time");
                break;
            case "Fall":
                System.out.println("Golden Time");
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }

    }
}
