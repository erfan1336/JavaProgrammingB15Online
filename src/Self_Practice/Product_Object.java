package Self_Practice;

public class Product_Object {

    public static void main(String[] args) {

        Product p1 = new Product();

        p1.setName("Apple");
        System.out.println("p1 = " + p1.getName());


        p1.setPrice(20000);
        p1.setPrice(-18000);
        System.out.println("p1 = " + p1.getPrice());
    }
}
