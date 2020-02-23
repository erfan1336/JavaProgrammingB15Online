package day17;

import java.util.Scanner;


public class WakeUp_NameCorrector {

    public static void main(String[] args) {

        //Create String variable to store your name in any combination
        // for example jon JoN JON any of them;
        // Create a variable called name2
        // make your first letter uppercase then rest lowercase

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String name = scan.nextLine();


        //String nameFixed = (name.charAt(0)+"").toUpperCase();
        //nameFixed = nameFixed + name.substring(1).toLowerCase();

        String nameFixed = name.toUpperCase().substring(0,1);
                nameFixed += name.substring(1).toLowerCase();

        System.out.println("NameFixed = " + nameFixed);



    }
}
