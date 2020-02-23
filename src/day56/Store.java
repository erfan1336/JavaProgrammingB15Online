package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    String name;
    List<Product> allProducts;  //store has List of products

    public Store(){   //no arg constructor
        this.name = "Cybertek Store";
        this.allProducts = new ArrayList<>();
    }

    //2 arg constructor to accept List<Product>
    public Store(String name, List<Product> otherList){
        this();  // calling no arg constructor here
        this.name = name;
        allProducts.addAll(otherList);
    }


    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}
