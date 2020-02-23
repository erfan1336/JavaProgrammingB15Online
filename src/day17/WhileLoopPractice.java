package day17;

public class WhileLoopPractice {

    public static void main(String[] args) {

        //count 1 to 5 then count 5 to 1

        // ->> iteration 1:

        // ->> iteration 2:

        // ->> iteration 3:

        // ->> iteration 4:

        // ->> iteration 5:

        // ->> iteration 6:

        int counter = 1;
        while (counter <= 5){
            System.out.println(counter + " ");
            ++counter;
        }

        System.out.println();
        System.out.println("counter = " + counter);
        System.out.println("------------------------------------");

        //
        while (counter > 1){
            --counter;
            System.out.print(counter + " ");
        }

    }
}
