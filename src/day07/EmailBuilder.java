package day07;

public class EmailBuilder {

    public static void main(String[] args) {

        //create a class called EmailBuilder with main method
        //Create 3 String variables for first name, last name, company
        //create another variable for email
        //create email in this format firstName_LastName@company.com
        //print out the results


        String firstName = "Erfan";
        String lastName = "Hamit";
        String company = "Intel Cooperation";
        String email = firstName+"_"+lastName+"@"+company+".com";

        System.out.println(email);



    }
}
