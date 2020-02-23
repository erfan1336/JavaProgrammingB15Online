package repl_problems;

public class P111_Compute {

    /*
    1*1
    2*2
    3*3
    10*10
    50*50

     */

    public static void main(String[] args) {

        int k = 1;
        int total = 0;

        do {

            total = total + (k * k);
            System.out.println(total);
            k++;
        }while (k <= 50);

    }
}
