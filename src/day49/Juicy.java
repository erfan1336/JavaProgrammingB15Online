package day49;

public interface Juicy {

    public abstract void melt();

    /**
     * another type of method Interface can have is :
     * static method, it must have body
     *
     *
     * STATIC METHODS OF INTERFACE ARE NOT INHERITED !!!!
     * IT MUST HAVE A BODY!
     *
     */

    public static void squeeze(){
        System.out.println("static squeezing !");
    }



    public static void main(String[] args) {
        Juicy.squeeze();
    }

}
