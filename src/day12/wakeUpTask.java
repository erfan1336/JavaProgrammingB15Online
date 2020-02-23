package day12;

import java.util.Scanner;

public class wakeUpTask {
    public static void main(String[] args) {
        //String weather = new String("Sunny");
        System.out.println("Please enter the weather condition: ");
        Scanner scan = new Scanner(System.in);
        String weather = scan.nextLine();

        //------------------------------> equals method
        if (weather.equals("Sunny")){
            System.out.println("Code in Sunny weather");

            //------------------> tried this method that doesn't work, to identify the difference
        }else if(weather == "Rainy"){
            System.out.println("Code in Rainy weather");
        }else {
            System.out.println("Rain or Shine just keep coding");
        }

    }
}
