package repl_problems;

import java.util.ArrayList;
import java.util.List;

public class P196_MethodsWithArrayList {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(9);
        nums.add(2);
        nums.add(5);

        System.out.println("nums = " + nums);

        for (int i = 0; i <=1  ; i++) {
            nums.remove(0);
        }
          //  System.out.println("nums = " + nums);
//            if (i == 1){
//                break;
//            }
 //       }


        System.out.println("nums = " + nums);

    }

    public static void test(ArrayList<Double> dubs){

        //write code here

        for (int i = 0; i <dubs.size() ; i++) {
            dubs.remove(0);
            //  System.out.println("nums = " + nums);
            if (i == 1){
                break;
            }
        }





    }
}
