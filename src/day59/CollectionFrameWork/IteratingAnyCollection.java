package day59.CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {

        //this is the ArrayList Constructor that accept any type of Collection type
        //public ArrayList(Collection<E> c) {}

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10, 4, 5, 22, 88, 13));



        //What is the best way to remove elements while iterating over collections, instead of using for/eah loops

        //iterating over a collection object using iterator
        Iterator<Integer> myIter = nums.iterator();

        while (myIter.hasNext()){
           // System.out.println("myIter = " + myIter.next());
            if (myIter.next() <= 10){
                myIter.remove();
            }
        }
        System.out.println("nums after removing elements that less than 10 = " + nums);

       /*
        //hasNext() --> check whether you have next item
        System.out.println("myIter has Next item ? = " + myIter.hasNext());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
*/




    }
}
