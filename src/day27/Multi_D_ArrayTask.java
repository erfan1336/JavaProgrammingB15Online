package day27;

public class Multi_D_ArrayTask {

    public static void main(String[] args) {

        int [][] numbers = {{12,11,10, 19} ,{19, 20,15},{23,-343,88888,453}};
        int max = numbers[0][0];  // assume that first element is the max

        for (int i = 0; i< numbers.length; i++){    //check each single dimensional array
            for (int j = 0; j < numbers[i].length; j++){   //j represents each elements of each single array (12,11,10....)
               if (max < numbers[i][j]){            //compares index 0 of the array with each indexes
                   max = numbers[i][j];
               }
            }
        }

        System.out.println("maximum number in whole array set is = " + max);

        System.out.println("=======================  For Each Loop ===============================");
        int max2 = numbers[0][0];
        int min2 = numbers[0][0];

        for(int[] eachArray : numbers){
            for (int eachElements : eachArray ){
                if (eachElements > max2){
                    max2 =  eachElements ;
                }
                else if (eachElements < min2){
                    min2 = eachElements;
                }
            }
        }
        System.out.println("maximum number in whole array set is = " + max2);
        System.out.println("minimum number in whole array set is = " + min2);

        System.out.println("===================================================================");





    }
}
