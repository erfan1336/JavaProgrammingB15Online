package day49;

public class Burger implements Edible {


    /**
     * public static final boolean IS_HUMAN_FOOD = true;
     *
     * a class can only extends one other class
     * a class can implement multiple interfaces
     */



    @Override
    public void eat() {

        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {

        System.out.println("Eat burger then drink Soda");
    }
}
