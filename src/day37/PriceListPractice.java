package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {

    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>();

        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("Price List = " + priceList);

        //Tasks:
        //change the third price to $10
        priceList.set(2,10.0);
        System.out.println("third item new price = " + priceList.get(2));

        //Add 4 dollar to first price
        priceList.set(0,priceList.get(0) + 4);
        System.out.println("priceList after add 4 to first price = " + priceList.get(0));

        // change last price to sum of first and second price
        double sumOfFirstAnd2ndTItems = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size() -1, sumOfFirstAnd2ndTItems);
        System.out.println("sumOfFirstAnd2ndTItems = " + priceList);


        //give 40% off to second price
        priceList.set(1,priceList.get(1) * 0.6);
        System.out.println("After 40% discount to second price  = " + priceList.get(1));

        for (int i = 0; i < priceList.size() ; i++) {

            double newVal = priceList.get(i) * 2;
            priceList.set(i,newVal);
        }

        System.out.println("pricelist after double the all the price = " + priceList);


        //swap the first value with last value

        int lastIndex = priceList.size()-1;
        Double temp = priceList.get(0);
        priceList.set(0, priceList.get(lastIndex));
        priceList.set(lastIndex,temp);

        System.out.println("after swap the first and last items = " + priceList);



    }
}
