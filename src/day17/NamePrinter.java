package day17;

public class NamePrinter {
    public static void main(String[] args) {

        String name = "Erfan Hamit Ablikem";

        //get each and every character and print out vertically

        int x = 0;
        //System.out.println(name.charAt(x));

        while (x < name.length()){            //or we can use  (x <= name.length()-1)
            System.out.print("index " + x + " : ");
            System.out.println(name.charAt(x));
            ++x;
        }


    }
}
