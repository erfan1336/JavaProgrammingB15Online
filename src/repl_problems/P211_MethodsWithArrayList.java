package repl_problems;

import java.util.ArrayList;

public class P211_MethodsWithArrayList {


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);

        int times = refuel_times(arr,3);
        System.out.println(times);

    }

    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel){

        int sum = 0;
        int result = 0;

        for (int i = 0; i < deliveries.size(); i++) {
            sum = sum + deliveries.get(i);
            result = sum/max_fuel;
        }
        return result;

    }
}
