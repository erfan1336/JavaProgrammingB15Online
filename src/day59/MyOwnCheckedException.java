package day59;

public class MyOwnCheckedException extends Exception {


}

class main{
    public static void main(String[] args) {

        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            e.printStackTrace();
        }
        System.out.println("My Own Thing Got Caught!!!");
    }
}

