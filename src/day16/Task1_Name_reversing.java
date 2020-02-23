package day16;

import java.util.Scanner;

public class Task1_Name_reversing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the name: ");
        String name1 = scan.nextLine();
//        int x = name1.length();
//
//        System.out.println(name1.charAt(x-1)+ "" +name1.charAt(x-2));

        int x = name1.length();

        int counter = 1;
        while ( counter <= x){
            System.out.print(name1.charAt(x-counter));
            counter++;
        }

        //charAt(5)    -->charAt(x)      x = 5
        //charAt(4) N  -->charAt(x-1)
        //charAt(3) A  -->charAt(x-2)
        //charAt(2) F  -->charAt(x-3)
        //charAt(1) R  -->charAt(x-4)
        //charAt(0) E  -->charAt(x-5)

    }

}
