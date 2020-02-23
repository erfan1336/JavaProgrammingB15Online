package day06;

public class UsingtheValueofOtherVariables {

    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My favorite number " + myFavoriteNumber);
        System.out.println("Your favorite number " + yourFavoriteNumber);

        // create a variable called yourOrder, type string and assign a value
        // create another variable called myOrder and assign the value
        // to same value as yourOrder by copying
        // and just print them out

        String yourOrder = "car";
        String myOrder = yourOrder;

        System.out.println("This is your order " + yourOrder + "\n" + "This is my order " + myOrder);



    }
}
