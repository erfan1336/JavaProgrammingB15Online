package repl_problems;

import java.util.Arrays;

public class Problem_193 {

        public static void main(String[] args) {
            String[] r1 = new String[]{"you ","are ","cool"};
            String[] r2 = new String[]{" you ","are ","awesome"};
            System.out.println( combineRs(r1,r2));
        }


        public static String combineRs(String[] r1,String[] r2)
        {
            String combined = "";
            for (int i = 0; i < r1.length; i++) {
                combined += r1[i];
            }
            for (int i = 0; i < r2.length; i++) {
                combined += r2[i];
            }
            return combined;
        }
}
