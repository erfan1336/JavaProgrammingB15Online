package day40;

public class Offer {


    String location;
    String company;
    long salary;
    boolean isFullTime;

    /*
    This is a instance method to print all the information about the offer
     */
    //inside the instances method we can directly access instance variable

    public void displayInformation(){

        System.out.println(
                           "Company = " + company +
                           "Location = " + location +
                           "Salary = " + salary +
                           "isFullTime = " + isFullTime) ;
    }

    //Write a method called turnToFullTime

    public void turnToFullTime (){
        isFullTime = true;
    }

    //Write a method to change the location of the Offer to the location user passed

    public void changeLocation (String newLocation){

        location = newLocation;
    }

    public void changeAll(String newCompany, String newLocation, long newSalary, boolean newFullTime){

        company = newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime = newFullTime;

        displayInformation();
    }


    //write a method to check the offer belong to 100K club, and return the result as true false
    public boolean is100KOffer(){

        // salary >= 10000 already can generate a boolean result, so we can use it as result
        return salary >= 100000;
    }


    /*
    Create an instance method called toString
    has no parameter
    return String representation of Offer Object
    I below format
    [Location = Virginia, Company = Amazon | Salary = 150000 | isFullTime = true]
     */

    public String toString(){

        String str = "Company = " + company +
                "Location = " + location +
                "Salary = " + salary +
                "isFullTime = " + isFullTime;
        return str;
    }



}
