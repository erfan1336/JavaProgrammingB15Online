package day35;

public class StoringToIntegerParsing {

    // i have a employee ID :"FB- 457"
    // give me the employee ID and store it into a number

    public static void main(String[] args) {

        String strNm = "100";
        int num = Integer.parseInt(strNm);
        System.out.println("num =" + num);



        /*
        Integer class is class coming from java.long package
        Its used for wrapping up primitive value and treat it

        It will turn a String that has only numbers and return int result
        If there is any non-numerical character --> it will throw NumberFormatException


         */

        String empID = "FB-457";

        int id = Integer.parseInt(empID.split("-")[1]);
        System.out.println(" id is = "  + id);
    }
}
