package day56;

import java.util.ArrayList;
import java.util.List;

public class ProducListPractice {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Iphone XL", 1299) ) ;
        productList.add( new Product("Sumsung 10", 1188) ) ;
        productList.add( new Product("Sumsung Note", 1288) ) ;

        System.out.println("productList.size() = " + productList.size());

        boolean result = false;
      /*  for (Product each: productList){
            if (each.getName().equals("Sony") && each.getPrice() == 499){
                result = true;
            }

            if (each.equals(new Product("Sony TV", 499))){
                result = true;
            }
        }*/


        boolean result1 = productList.contains(new Product("Macbook Air", 1299));



    }
}
