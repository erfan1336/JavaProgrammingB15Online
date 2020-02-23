package day44;

public class PersonAction {

    public static void main(String[] args) {

        Person p1 = new Person("Jon Snow", 27);
        p1.species = "Human";
        System.out.println("P1 = " + p1);

        Person p2 = new Person("Arya Strak",18);
        System.out.println("p2 = " + p2);


        Person p3 = new Person("Danni", 25);
        p3.species = "humanoid";
        System.out.println("p3 = " + p3);

        Person p4 = new Person("Niki", 30);
        System.out.println("p4 = " + p4);
    }

}
