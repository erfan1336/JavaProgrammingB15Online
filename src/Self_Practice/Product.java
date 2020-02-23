package Self_Practice;


/**
 * make this product a well encapsulated
 * make all the instance field/variables private, so it can only be accessible inside the same class
 * provide public getters and setters method
 */
public class Product {

    private String name;
    private double price;

    public String getName(){
        return name;
    }

   public void setName(String newName){
        name = newName;
   }

   public double getPrice(){
        return price;
   }

   public void setPrice(double newPrice){
        if (newPrice > 0) {
            price = newPrice;
        }
   }
}
