package day49;


/**
 * CAN A CLASS BOTH EXTEND ANOTHER CLASS AND IMPLEMENT AN INTERFACE?
 * YES.
 *
 *
 * a class can only extends one other class
 * a class can implement multiple interfaces
 */


public class IceCream extends Object implements Edible{

    @Override
    public void eat() {

        System.out.println("eat with spoon!!");
    }

    @Override
    public void drink() {

        System.out.println("drink it if it has melted in the cup!");
    }
}
