package repl_problems;

public class P224_OOP5 {

    public static void main(String[] args) {

        //Create the person object with No-Arg constructor
        Person person = new Person();

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.toString());

        //Create the person object with 3Arg Constructor
        Person person1 = new Person("Fatime","Lee",22);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1.toString());





    }

}


