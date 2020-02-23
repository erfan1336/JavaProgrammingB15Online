package day09;

public class DayCode_Switch {
    public static void main(String[] args) {
        int dayCode = 5;
        String dayName = " ";

        if (dayCode == 1) {
            dayName = "Monday";
        } else if (dayCode == 2) {
            dayName = "Tuesday";
        } else if (dayCode == 3) {
            dayName = "Wednesday";
        } else if (dayCode == 4) {
            dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else {
            dayName = "Unknown";
        }
        System.out.println("Day code is " + dayCode + " ; Day " + dayName);

    }
}
