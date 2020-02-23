package day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

        //for each loop syntax
        //for (dataTypeOfYourArray variableNameForEachItem  : yourArrayVariable){
        //       do something with the array
        //}

        for (int i = 0; i < prices.length ; i++) {

            double eachPrice = prices[i];
            System.out.println("eachPrice = " + eachPrice);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //For Each Loop can ONLY be used for Array
        //There is no infinite loop ever in For Each Loop
        for(double erfansEachPrice  : prices ){                           //prices --> Array Variable
            System.out.println("eachPrice = " + erfansEachPrice);
        }

        System.out.println("-----------------------------------------");
        for (double blablabla : prices){
            System.out.println("Prices are : " + blablabla);
        }
    }
}
