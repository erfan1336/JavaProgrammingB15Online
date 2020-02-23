package Other;

public class MultiplicationTablePractice {

    public static void main(String[] args) {

         //1 X 1 = 1
         //1 X 2 = 2
        //int a = 0;
        //int b = 1;
        int c = 0;



        for (int b = 1; b < 15; b++){
            System.out.println(" Multiplication of " + b + " ---------");
            for (int a = 1; a < 12 ; a++) {
                System.out.println( b + " x " +(a+1) + " = "+ b*(a+1));
            }
        }
    }

}
