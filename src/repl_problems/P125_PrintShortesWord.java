package repl_problems;

import java.util.Scanner;

public class P125_PrintShortesWord {
    public static void main(String[] args) {

        ////"grape bread orange ok ultraviolet port"
        // Kratos
        //oil
        //vulnerability
        //power
        //lacoste
        //berry


        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};

        String shortestWord = str[0];

        for(int i = 0; i < str.length ; i++){
            if(str[i].length() < shortestWord.length()){
                shortestWord = str[i];
            }
        }

        System.out.println("Shortest word in the array is = " + shortestWord);

        System.out.println("================== Below Code Also Works==================");

        /*
        for (String eachWord : str){
            if (eachWord.length() < shortestWord.length()){
                shortestWord = eachWord;
            }
        }
        System.out.println(shortestWord);

         */
    }
}
