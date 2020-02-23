package day24;

public class WarmUp_ShoppingWithArray {

    public static void main(String[] args) {

        /*
        Create a String array of 6 items to store groceryItems
        {"apple","banana","grape","strawberry","blueberry","kiwi"}
        Create a float array of 6 float values to store prices
        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
         assume that the order of grocery Items match the prices in same order.
         */

        String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};

        int itemCount = groceryItems.length;
        int lastIndex = itemCount - 1;

        String lastFruit = groceryItems[lastIndex];  //groceryItems[groceryItems.length - 1]

        for ( String eachFruit : groceryItems) {
            System.out.print(eachFruit );
            if (!eachFruit.equals(lastFruit)) {
                System.out.print(" ---> ");
            }
        }



    }
}
