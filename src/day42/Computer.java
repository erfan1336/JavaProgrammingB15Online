package day42;


/**
 * attributes:
 * bran, ram(1-128), price
 *
 * behaviours:
 *
 * run program --> print brand is running program with the ram (size)
 * calculate --> print brand is calculating
 *
 */
public class Computer {

    private String brand;
    private int ram;
    private double price;

    public void runProgram(){
        System.out.println(this.brand + " is running program with the ram size " + ram);
    }

    public void Calculate(){
        System.out.println(brand + " is calculating");
    }

    //Generate the getter and setters as below:

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        //valid ram is between 1-128 only
        if (ram >= 1 && ram <= 128) {
            this.ram = ram;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 20) {
            this.price = price;
        }
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
