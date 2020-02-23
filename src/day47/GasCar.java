package day47;

public class GasCar extends Car {

    @Override
    public void start() {

        System.out.println("Start the gas car BMW");
    }

    @Override
    public void stop() {

        System.out.println("Stop the Gas car");
    }

    @Override
    public void goForward() {

        System.out.println("Go forward the gas car BMW");
    }

    @Override
    public void goBackward(String direction) {

        System.out.println(("Go backward gas car" + direction));
    }
}
