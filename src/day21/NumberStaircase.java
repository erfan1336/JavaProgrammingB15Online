package day21;

import org.w3c.dom.ls.LSOutput;

public class NumberStaircase {

    public static void main(String[] args) {

        /*
         1              (0)
         12             (0,1)
         123            (0,1,2)
         1234           (0,1,2,3)
         12345          (0,1,2,3,4)
         */

        String star = " ";
//        for (int j = 1; j <5 ; j++) {
//            System.out.println(j + "");
//            for (int i = 1; i <= j ; i++) {
//                System.out.print(i);
//            }
//        }

        //int x = 1;
        int y =10;




        for (int i = 0; i <=y ; i++) {

            for (int x = 1; x <=y; x++){
                star += "*";
                System.out.println(star);
            }
            break;
            
        }


    }
}
