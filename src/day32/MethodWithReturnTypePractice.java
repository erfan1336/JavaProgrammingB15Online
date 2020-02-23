package day32;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {

        //call the method
        System.out.println(divide(10,3));

        System.out.println(divide(10,0));

    }

    //create method called "divide"
    // it has two int parameters and return the result as double
    //

    public static double divide(double num1,double num2 ){
        if (num2 == 0){
            return 0;
        }else {
            return num1/num2;
        }


    }
}


