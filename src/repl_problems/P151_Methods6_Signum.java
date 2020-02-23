package repl_problems;

import java.util.Scanner;

public class P151_Methods6_Signum {

    public static void sign(int n){

        if (n > 0){
            System.out.println(1);
        }else if (n < 0){
            System.out.println(-1);
        }else if (n == 0){
            System.out.println(0);
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }


}
