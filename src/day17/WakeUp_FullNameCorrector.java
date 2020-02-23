package day17;

public class WakeUp_FullNameCorrector {
    public static void main(String[] args) {

        String fullName = "arYa sTark";

        String firstName = fullName.substring(0,4);
        String lastName = fullName.substring(5);

        // correcting the first name
        String firstNameCorrected = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        System.out.println(firstNameCorrected);
        System.out.println("first name corrected: " + firstNameCorrected);

        //correcting the last name
        String lastNameCorrected = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
        System.out.println("last name corrected: " + lastNameCorrected);

        //combination
        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);





    }

}
