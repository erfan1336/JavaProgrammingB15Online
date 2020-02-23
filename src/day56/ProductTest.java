package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {

    public static void main(String[] args) {

        Product p1 = new Product("MacbookPro",2999);
        Product p2 = new Product("Sony TV",699);
        Product p3 = new Product("Sony TV",699);
        System.out.println(p1 == p2);
        System.out.println(p2 == p3);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("MacBookPro", 2999));
        productList.add(new Product("MacBook Air", 1299));
        productList.add(new Product("Iphone X", 999));
        productList.add(new Product("Sony TV", 1999));
        productList.add(new Product("LG X", 899));
        productList.add(new Product("Hitachi", 1299));

        Product sony = new Product("Sony TV",1999);

        System.out.println("productList.size() = " + productList.size());
        System.out.println("productList.contains(sony) = " + productList.contains(sony));
        System.out.println("productList = " + productList.indexOf(sony));


    }

}
