package day33;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MethodWithReturnPractice_2 {

    public static void main(String[] args) {

        System.out.println( getDaysOfTheWeekFromNumber(19));

        int[] allDays = {1,3,5,66,556};

        for (int eachDay: allDays) {
            System.out.println("each day = " + getDaysOfTheWeekFromNumber(eachDay));
        }



    }

    /*
    convertNumberToDay
    This method will take number from 1-7, and convert that to actual day in word
    @param int dayCode to represent day in number
    @return the day in word in English if the number is valid

    --> if the number is not 1-7 --> return INVALID DAY

     */

//
//    public static  String convertNumberToDay(){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter the number for day: ");
//        int dayCode = scan.nextInt();
//        String dayNamesInEnglish = " ";
//
//        String[] dayNames= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
//
//        for (int i = 0; i <7 ; i++) {
//            dayNamesInEnglish = dayNames[i];
//        }
//
//        return dayNamesInEnglish;
//    }
//
    public static String getDaysOfTheWeekFromNumber(int dayCode){

        String dayName = "";

        switch(dayCode){

            case 1:
                return "Monday";

            case 2:
                return "Tuesday";

            case 3:
                return "Wednesday";


            case 4:
                return "Thursday";

            default:
                return "Funday(Invalid Input)";


        }


        //return dayName;
    }
}
