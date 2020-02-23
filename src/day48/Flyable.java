package day48;


/**
 * This is how we create and Interface
 * interface is abstract type just like abstract class
 * No Object can be created from it
 * it provide guideline for implementing classes, its like signing contract
 */
public interface Flyable {

    //an interface can only have public static final field
    public static final boolean HAVE_WING = true;

    public abstract void fly();


    //can we have constructor?  absolutely NO!!!!!!!!!!!





}
