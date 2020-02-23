package day35;

public class Practice {
    public static void main(String[] args) {

        String Asat = "123,Love 222";

        String[] allwords = Asat.split(" ");

        //String firstNumSpace = allwords[0].replace(",","");


        String firststr = allwords[0].replace(","," ");

        //System.out.println("first array = " + firststr);


//        int firstNum = Integer.parseInt(allwords[0]);
//        int lastNum = Integer.parseInt(allwords[1]);
//
//        System.out.println("Total mul is = " + (firstNum *lastNum));


        String Erfan = "600,2";
        String[] ErfanArray = Erfan.split(",");
        System.out.println("Total  = " + (Integer.parseInt(ErfanArray[0]) * Integer.parseInt(ErfanArray[1]))) ;

    }
}
