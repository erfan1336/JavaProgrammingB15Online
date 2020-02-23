package day32;

public class MethodWithReturnIntro {

    public static void main(String[] args) {

        String name = giveMeMyName();
        System.out.println(name);


        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);
        System.out.println();
        System.out.println("myResult " + doubleTheNumber(100));

        System.out.println(add2Numbers(12,16));

    }


        //create a method called add, accept 2 int parameter
        //and return the result as int

        public static int add2Numbers( int num1, int num2){
           return num1 + num2;
        }


    // i want to create a static method called giveMeMyName
    //it returns your name as a result

    public static String giveMeMyName(){

        return "Erfan";
    }



    //create the static method "doubleTheNumber" that double the value of a number
    //it accept one int parameter and return doubled value of that number
    //whole purpose of writing a method that return a value
    //so we can save the result after calling the method and use it somewhere else
    public static int doubleTheNumber(int num){

        System.out.println("i am going to double the value of num  = " + num);
        int result = 2 * num;
        return result;
    }
}
