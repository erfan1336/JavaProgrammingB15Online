package day33;

public class Return_Keyword_PracticeWithMain {

    public static void main(String[] args) {

        System.out.println("Age is = " +calculateAgeFromBirthday(1999));

    }

    public static int calculateAgeFromBirthday(int birthYear){

        //i want to remove negative scenario first and just return 0
        if (birthYear <= 1900 || birthYear > 2020){
            return 0;
        }

        return 2019 - birthYear;
    }
}
