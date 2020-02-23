package day47;

public class ElectricCar extends Car {

    int battery;

    @Override
    public void start() {
        System.out.println("This is how electric car start.");
    }

    public void stop(){
        System.out.println("This is how car stops.");
    }

    public void goForward(){
        System.out.println("This is the way car go forward");
    }

    public void goBackward(String direction){

        System.out.println(("Turning to " + direction));
    }



}
