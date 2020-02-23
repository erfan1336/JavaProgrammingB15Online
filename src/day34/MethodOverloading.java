package day34;

public class MethodOverloading {

    public static void main(String[] args) {

        sayHello();

        sayHello("Universe");

        sayHello(56);

        System.out.println(sayHello("Erfan","Hamit"));  //<--- return has to be printed with system out println

    }

    public static void sayHello(){                 //<-- Method Header
        System.out.println("Hello, Word");
    }

    public static void sayHello(String name){
        System.out.println("Hello, " + name);
    }

    public static void sayHello(int name){
        System.out.println("Hello, " + name);
    }

    public static String sayHello(String firstName, String lastName){
        return "Hello " + firstName + " " +  lastName;


    }

}
