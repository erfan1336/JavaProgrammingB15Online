package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int number = 1; number < 100; number++) {
            nums.add(number);
        }
        System.out.println("nums = " + nums);

    }
}
