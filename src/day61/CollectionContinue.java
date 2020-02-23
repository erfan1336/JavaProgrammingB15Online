package day61;

import java.util.*;

public class CollectionContinue {

    public static void main(String[] args) {

        //Collection interface as super type, pointing to an ArrayList Object
        Collection<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,6, 4,5,7,8));
        System.out.println(nums);

        //can we use get method when we have Collection as reference type??
        //NO!!!  Only reference type decide what WE CAN ACCESS


        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,88,99,23,14));
        //i want to sort this List
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);
    }
}
