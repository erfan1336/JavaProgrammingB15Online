package day40;

import java.util.ArrayList;

public class HotMarketActions {

    public static void main(String[] args) {

        Offer o1 = new  Offer();
        o1.company = " Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.company = " Amazon";
        o2.location = "Vancouver";
        o2.isFullTime = true;
        o2.salary = 100000;
        o2.displayInformation();

        //create ArrayList of Offer to store multiple offer objects
        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add( o1 );
        myOffers.add( o2 );

     //   System.out.println("my offeres =" + myOffers);  -->
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


        o1.changeAll("Amazon  "," Seattle  ",150000,true);
        o1.displayInformation();



    }
}
