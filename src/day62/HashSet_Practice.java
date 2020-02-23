package day62;

import java.util.*;


public class HashSet_Practice {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(10,10,10,20,20,20,30,30,30,50,50,50);

        Set<Integer> myNumSet = new HashSet<>(numList);

        System.out.println("myNumSet = " + myNumSet);

        Set<String> states = new HashSet<>(Arrays.asList("VA", "WA","OR","CA","FL","KC","BC"));
        System.out.println("states = " + states);
        System.out.println("states.size() = " + states.size());


        Iterator<String> stateIterator = states.iterator();
        while (stateIterator.hasNext()){
            System.out.println("stateIterator.next() = " + stateIterator.next());
        }

        states.remove("KC");
        System.out.println("states after removal = " + states);


        //Remove all/any states if included C string inside
        //Need to create new Iterator for it
        Iterator<String> strIterator = states.iterator();
        while (strIterator.hasNext()){
            String each = strIterator.next();

            if (each.contains("C")){
                strIterator.remove();
            }
        }
        System.out.println("states after removing C = " + states);



        //Remove with Lambda Expression
        states.removeIf(each -> each.contains("O"));
        System.out.println("states = " + states);


    }
}
