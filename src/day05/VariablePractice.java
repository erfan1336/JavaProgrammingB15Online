package day05;

public class VariablePractice {

    public static void main(String[] args) {
        /*Block comment,

        whole numbers:
        fractional numbers:     double, float
        logical :               boolean
        character:              char
         */


        //Age calculator
        //given birth year, please calculate the age
        int birthYear = 2001;
        int currentYear = 2019;

        //Task 2
        //speed limit is some number, and your current speed is this
        //generate this output of : you are driving 10 mph more than speed limit

        int speedLimit = 60;
        int currentSpeed = 75;
        int difference = currentSpeed - speedLimit;

        if (difference >10){
            System.out.println("You are speeding!!! And you are over speeding " + difference + " mph from the speed limit"  );
        }
        else System.out.println("You are not speeding");

    }
}
