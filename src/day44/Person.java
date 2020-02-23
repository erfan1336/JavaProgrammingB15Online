package day44;

public class Person {

    private String name;
    private int age;


    public static String species;  // <-------- Static Field, belong to the Class, it will be shared by all the objects


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
