package day45;

public class Phone extends Electronic {

    double size;
    double price;


    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";

        //Sub class inherit every visible instance field and static field
        //Sub class inherit every visible instance method and static method

        System.out.println("Electronic.useElectricity = " + Electronic.useElectricity);
        System.out.println("Phone.useElectricity = " + Phone.useElectricity);

        //directly accessing the static field of same class in static method
        System.out.println("useElectricity = " + useElectricity);

        displayUseElectricity();

        //Static Way
        Electronic.displayUseElectricity();
        Phone.displayUseElectricity();


    }
}
