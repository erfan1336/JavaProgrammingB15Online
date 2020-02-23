package day32;

public class NumberAction {

    public static void main(String[] args) {

        //call numberComparison
        numberComparison(15, 15);

        //call StringRepeater
        stringRepeater("erfan", 5);

        //call skipCountBy3From0to50
        skipCountBy3From0to50();

        //call print1toX();
        print1toX(5);

        //countDownByEvenNumberFromXtoY();
        countDownByEvenNumberFromXtoY(25,50);

    }

    /* create static void method as below

    numberComparison
    -->this method has 2 parameters called num1 and num2

    String Repeater:
    this method has 2 parameters
       -->String strToRepeat and int count
       -->repeat printing the string as many times as <count> number define

    skipCountBy3From0to50:
    --> create a method that has no parameter
    --> and skip count by 3 from 0 to 50

     */

    public static void numberComparison(int num1, int num2) {


        if (num1 > num2) {
            System.out.println(num1 + " is more than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " is more than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
        System.out.println("------------------------------------------------");

    }

    public static void stringRepeater(String strToRepeat, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(strToRepeat);
        }
        System.out.println("------------------------------------------------");
    }

    public static void skipCountBy3From0to50() {

        for (int i = 0; i < 50; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }

    //this method will print from 1 to the counter that user entered
    public static void print1toX(int x){
        for (int i = 0; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }

    public static void countDownByEvenNumberFromXtoY(int x, int y){
        for (int i = x; i <= y ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------");
    }

}
