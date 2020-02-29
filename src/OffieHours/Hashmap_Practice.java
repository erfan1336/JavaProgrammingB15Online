package OffieHours;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap_Practice {

    public static void main(String[] args) {

        HashMap<Integer, String> digits = new HashMap<>();

        digits.put(1,"one");
        System.out.println("digits.size() = " + digits.size());
        digits.put(5,"five");
        digits.put(10,"Ten");
        System.out.println("digits.size() = " + digits.size());

        for (Integer each : digits.keySet()){
            System.out.println("digits.get(each) = " + digits.get(each));
        }

        Iterator<Integer> iterator = digits.keySet().iterator();
        while (iterator.hasNext()){

            Integer iterValue = iterator.next();
            System.out.println(iterValue + " -- " + digits.get(iterValue));
        }

        System.out.println("digits.toString() = " + digits.toString());

        //.replace(key,value) - provide existing key and new value

        digits.replace(1,"ONE");
        System.out.println("\"Map after replacement\" = " + digits);

        //check for the key
        if (digits.containsKey(10)){
            digits.replace(10, "TEN");
        }
        System.out.println("MAP after 2nd replacement = " + digits);


        digits.replace(6,"SIX"); // no exceptions
        System.out.println("digits = " + digits);

        //check for value
        if (digits.containsValue("five")){
            digits.replace(5,"FIVE");
        }
        System.out.println("digits = " + digits);

        //.remove(key)  .remove(key,value)
        digits.remove(1);
        System.out.println("map after 1st remove = " + digits);

        //.remove(key,value)
        digits.remove(5,"FIVE");
        System.out.println("map after remove key and value of 5 = " + digits);

    }
}
