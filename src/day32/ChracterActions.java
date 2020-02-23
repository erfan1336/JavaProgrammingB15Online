package day32;

public class ChracterActions {
    public static void main(String[] args) {

        //call the method
        printAtoZ();
        printAtoZ();
        System.out.println();

        //call the method
        printZtoA();

        //call the method
        printAlphabetInRange('a','f');
        printAlphabetInRange('G','B');
        printAlphabetInRange('A','A');
        printAlphabetInRange('a','A');


    }


    //Pint A to Z with new method

    public static void printAtoZ(){
        for (char iChar = 'A'; iChar <= 'Z'; iChar++){
            System.out.print(iChar + " ");
        }
        System.out.println(); // so we can move to next line
    }

    public static void printZtoA(){

        for (char iChar = 'Z'; iChar >= 'A'; iChar--){
            System.out.print(iChar + " ");
        }
        System.out.println(); // so we can move to next line

    }

    public static void printAlphabetInRange(char beginning, char ending){
        if (beginning < ending){
            System.out.println("We need to increment from " + beginning + " till " +ending);

            for (char iChar = beginning; iChar <= ending; iChar++){
                System.out.print(iChar + " ");
            }
            System.out.println();

        }else if (beginning > ending){
            System.out.println("We need to decrement from " + beginning + " till " + ending);

            for (char iChar = beginning; iChar >= ending; iChar--){
                System.out.print(iChar + " ");
            }
            System.out.println();

        }else {
            System.out.println("They are same character");
        }
    }


}
