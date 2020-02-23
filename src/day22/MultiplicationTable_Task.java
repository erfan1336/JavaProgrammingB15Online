package day22;

public class MultiplicationTable_Task {

    public static void main(String[] args) {


        //inner loop that calculates multiplication table 1
//        for (int base = 0; base <=12 ; base++) {
//          //  System.out.println("1 x 1 = " + 1 * 1);
//            System.out.println("1 x " + base + " = " + 1 * base);
//        }
//
//        /*  system.out.println ("2 x1 = " + 2 * 1)
//            system.out.println ("2 x2 = " + 2 * 2)
//            system.out.println ("3 x3 = " + 2 * 3)
//         */
//        System.out.println("multiplication table of 2");
//        for (int base = 0; base <=12 ; base++) {
//            //  System.out.println("1 x 1 = " + 1 * 1);
//            System.out.println("2 x " + base + " = " + 2 * base);
//        }
//        System.out.println("multiplication table of 3");
//        for (int base = 0; base <=12 ; base++) {
//            //  System.out.println("1 x 1 = " + 1 * 1);
//            System.out.println("3 x " + base + " = " + 3 * base);
//        }

        // This loop is for iterating number from 1 to 10 to get multiplication table
        for (int timesTable = 1; timesTable < 10; timesTable++) {
            System.out.println("multiplication table of " + timesTable);       // i want to know which number i want to get the multiplication table
            for (int base = 1; base <= 12; base++) {                           // this loop will generate multiplication table for one number
                //  System.out.println("1 x 1 = " + 1 * 1);
                System.out.println(timesTable + " x " + base + " = " + timesTable * base);
            }
        }


    }
}
