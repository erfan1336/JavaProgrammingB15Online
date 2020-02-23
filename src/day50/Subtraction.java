package day50;

public class Subtraction extends Question {

    //Constructor
    public Subtraction(int num1, int num2){
        super("Subtraction question"," - ");

        //need to make num1 is always more than num2
        if (num1 < num2){
            int temp;
            temp = num1;
            num2 = temp;
        }

        this.num1 = num1;
        this.num2 = num2;

    }


//    public Subtraction(String questionType, String operator) {
//        super(questionType, operator);
//    }

    @Override
    public void calculate() {
        answer = num1 - num2;
        calculated = true;
    }


    @Override
    public String toString() {

        if (calculated == true) {
            //return super.toString() + num1 + operator + num2 + " = " + answer;
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return num1 + operator + num2 + " = ";
        }
    }

}
