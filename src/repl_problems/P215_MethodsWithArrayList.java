package repl_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class P215_MethodsWithArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,6,4,8));

        System.out.println(twoTimes(arr));

    }


    public static ArrayList<Integer> twoTimes(ArrayList<Integer> lst){


        ArrayList<Integer> newLst = new ArrayList<>(8);
        int j = 0;
        for (int i = lst.size()-1; i >=0; i--) {
            newLst.add(j, lst.get(i));
            newLst.add(j+1, lst.get(i));

        }
        return newLst;
//        ArrayList<Integer> newList = new ArrayList<>(intList);
//        newList.addAll(intList);
//
//        for (int i = 0; i < newList.size() ; i+=2) {
//            newList.add(intList.get(i));
//            newList.add(intList.get(i));
//        }
//
//        return newList;
    }
}
