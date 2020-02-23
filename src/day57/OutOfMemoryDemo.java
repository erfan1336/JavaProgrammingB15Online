package day57;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryDemo {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        /*

        This will create HEAP memory full -->
        java.lang.OutOfMemoryError: Java heap space

        for (int i = 1; i >0 ; i++) {
            System.out.println(i);
            nums.add(i);
        }*/
    }
}
