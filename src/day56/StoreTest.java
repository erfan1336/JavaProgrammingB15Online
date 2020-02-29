package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {

    public static void main(String[] args) {

        Store s1 = new Store();
        System.out.println(s1.name);

        s1.allProducts.add(new Product("imac", 3999));
        System.out.println(s1.allProducts);

        List<Product> denisList = Arrays.asList(new Product("vine", 455),
                new Product("cookie", 34),
                new Product("car", 4555));

        Store s2 = new Store("Denis Store", denisList);
        System.out.println("s2 = " + s2);

       /* //find the product with MAX PRICE ASSOCIATED
        public Product findTheMostExpensiveProduct(){
            Product maxProduct = null;
            return maxProduct;
        }*/


    }
}
