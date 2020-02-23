package day40;

import java.util.ArrayList;

public class HotMarketActions2 {

    public static void main(String[] args) {

        Offer o1 = new  Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 1000;
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.company = "Amazon";
        o2.location = "Vancouver";
        o2.isFullTime = true;
        o2.salary = 100000;
        o2.displayInformation();

        Offer o3 = new Offer();

        o2.salary = o2.salary +200000;
        System.out.println("new amazon salary =" + o2.salary);

        //set the salary value of o4 offer object to sum of all the offers
        o3.salary = o1.salary + o2.salary +o3.salary;
        o3.turnToFullTime();
        o3.displayInformation();
        System.out.println("sum of all salary =" + o3.salary);
        o3.changeLocation("Ghulja");
        o3.displayInformation();

        //create ArrayList of Offer to store multiple offer objects
        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add( o1 );
        myOffers.add( o2 );


     //   System.out.println("my offers =" + myOffers);  -->
        System.out.println(" -------------------- My Offers -----------------------");

        for ( Offer each:myOffers) {
            each.displayInformation();
        }

        System.out.println("------------- for loop display --------------------------");

        for (int i = 0; i < myOffers.size() ; i++) {
            //store each item to a variable each

            Offer each = myOffers.get(i);
            each.displayInformation();

            //myOffers.get(i).displayInformation();  --> this is the short way to display
        }

        System.out.println("-----------------------------------------------------------------");

        boolean result = o1.is100KOffer();
        if (result == true){
            o1.changeLocation(" Atlanta");
        }
        o1.displayInformation();







    }
}
