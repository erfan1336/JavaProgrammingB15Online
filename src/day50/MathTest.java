package day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {

    public static void main(String[] args) {

        Addition q1 = new Addition(10,90);
        System.out.println("before calculation q1 = " + q1);

        q1.calculate();
        System.out.println("After calculation q1 = " + q1);


        Subtraction q2 = new Subtraction(10,90);
        System.out.println("q2 = " + q2);

        q2.calculate();
        System.out.println("q2 = " + q2);

        Subtraction q3 = new Subtraction(90,70);
        System.out.println("q3 = " + q3);

        q3.calculate();
        System.out.println("q3 = " + q3);

        Multiplication q4 = new Multiplication(3, 23);
        System.out.println("q4 = " + q4);
        q4.calculate();
        System.out.println("q4 = " + q4);

        System.out.println("=========================================");

        List<Question> allTestQuestions = Arrays.asList(q1,q2,q3,q4);
        for (Question eachQ : allTestQuestions){
            System.out.println("eachQ = " + eachQ);
        }



    }
}
