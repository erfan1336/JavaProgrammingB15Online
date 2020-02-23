package day42;

public class MovieAction {
    public static void main(String[] args) {

        Movie m1 = new Movie();
        System.out.println("m1 = " + m1);

        Movie m2 = new Movie("Joker",2.2, "Drama");
        Movie m3 = new Movie("Frozen",1.5,"Family");
        Movie m4 = new Movie("Pursuit of Happiness",2.0,"Drama");

        //Print out
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);
        System.out.println("m4 = " + m4);


        //using a getter method to access
        //System.out.println(n2.name); --> does not work since we changed to private

        //Question : how to create Immutable Object? --> look at the answer in Encapsulation PDF page 10
        //use private
        //do not provide setter
        //

        System.out.println(m2.getName());
    }

}
