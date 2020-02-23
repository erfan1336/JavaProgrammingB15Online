package day49;


/**
 * interface is like a contract, once its signed it will provide all the details
 *
 * INTERFACE is NOT a CLASS!
 */
public interface Edible {


    /**
     * IN INTERFACE  fields are automatically public static final if not defined
     * public static final field naming convention is  ALL_CAPS
     * you can have as many as constants as you want
     */

    public static final boolean IS_HUMAN_FOOD = true;

    // if a method with no-body is not defined public abstract, its automatically public abstract

    public abstract void eat();

    public abstract void drink();





}
