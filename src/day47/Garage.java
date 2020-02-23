package day47;

public class Garage {

    public static void main(String[] args) {

        //Abstract class (Car Class) cant not be instantiated;
        //It means we cannot create object out of it
    //    Car c1 = new Car();

            // Car c1 = new Car();


            ElectricCar e1 = new ElectricCar();
            e1.start();
            e1.stop();
            e1.goForward();
            e1.goBackward("LEFT!");

            GasCar c1 = new GasCar();
            c1.start();
            c1.goBackward("Turn Left");
            c1.goForward();
    }
}
