package day26;

import java.util.Arrays;

public class Split_Practice {

    public static void main(String[] args) {
        String survey = "Complete B15 online class 1 month survey ";

        char[] surveyChars = survey.toCharArray();

        for (char eachChar : surveyChars){

            System.out.println("each char is : " + eachChar);
        }

        System.out.println("-------------While Loop----------------------");

        int x = 0;
        while (x < surveyChars.length){
            System.out.println("each character is : " + surveyChars[x]);
            x++;
        }

        System.out.println("-------------------For Loop----------------------------");
        for (int i = 0; i < surveyChars.length; i++){
            System.out.println("each character is : " + surveyChars[i]);
        }

        System.out.println("------------------Do While Loop --------------");

        int y = 0;
        do {
            System.out.println("each character is : " + surveyChars[y]);
            y++;
        }while (y < surveyChars.length);


        //sor the array alphabetically from low to high

        System.out.println("Before SurveyChars: " + Arrays.toString(surveyChars));

        Arrays.sort(surveyChars);
        System.out.println("After SurveyChar sor: " + Arrays.toString(surveyChars));
    }
}
