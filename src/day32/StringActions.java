package day32;

public class StringActions {

    public static void main(String[] args) {

        reversePrintMyOwnName();

        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulhan");


        String name2 = "Erfan Hamit";

        for (int i = 0; i < name2.length(); i++) {
            System.out.print(name2.charAt(i));

            //if i am not at last index then i print -
            if (i != name2.length()-1){
                System.out.print("-");
            }



//            if(i ==name.length()-1){
//                break;
//            }
//            System.out.print("-")

        }

    }


    public static void reversePrintMyOwnName(){

        String name = "Erfan Hamit";

        //put dash in between

        for (int i = name.length()-1; i > 0; i--){
            System.out.print(name.charAt(i));
        }
        System.out.println();




    }

    public static void printStringWithDashInBetween(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));

            //if i am not at last index then i print -
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }

}
