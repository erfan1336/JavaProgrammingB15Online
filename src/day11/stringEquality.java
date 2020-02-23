package day11;

public class stringEquality {
    public static void main(String[] args) {
        String name = "Erfan";
        String name2 = new String("Erfan");
        String name3 = "Erfan";
        String name4 = new String("Erfan");

        System.out.println(name);
        System.out.println(name2);

        System.out.println(name==name2);

        System.out.println("Using Equal Method");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name.equals(name4));
    }
}
