package day42;

public class BikeAction {

    public static void main(String[] args) {

        Bike b1 = new Bike();
        Bike b2 = new Bike();

        // i don't want empty gear when object is created
        // i want the bike come with gear set to 1

        System.out.println("b1 gear = " + b1.gear);
        System.out.println("b2 gear = " + b2.gear);

        Bike b3 = new Bike(4);
        System.out.println(b3.gear);

        //I want a Bike object with both speed and gear to the value i specify
        Bike b4 = new Bike(10,8);
        System.out.println("b4 bike with new settings as gear = " + b4.gear + " and speed = " + b4.speed);

    }
}
