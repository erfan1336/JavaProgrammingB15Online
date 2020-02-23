package day17;

public class EvenNumberFInder_BackWard {
    public static void main(String[] args) {

        int counter = 100;

        while (counter > 0){
            if (counter % 2 == 0){
                System.out.print(" " + counter);
            }
            --counter;

        }
    }
}
