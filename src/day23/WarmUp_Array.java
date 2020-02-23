package day23;

public class WarmUp_Array {
    public static void main(String[] args) {

        //create an int array of 7 items
        //assign values
        //print out in reverse order
        //store last item in a variable called last item
        //print out separately
        //print the item right in the middle
        //find sum, find average, fin max, find min

        //first way to create an array object and add value index locations
        int[] numbers = new int[7];
        numbers[0] = 23;
        numbers[1] = 22;
        numbers[2] = 18;
        numbers[3] = -10;
        numbers[4] = 33;
        numbers[5] = 28;
        numbers[6] = 27;

        //2nd way to create an Array with values already filled
        int[] nums2 = new int[]{12,33,45,56,23,12,18,12,};

        //3rd and shortest way  !!!(this one must happen in one line)
        int[] nums3 = {11,13,24,34,45,98,12,33};

        System.out.println("------------Original Order-----------------");
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("------------Reverse Order-----------------");
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.println(numbers[i]);
        }

        int arraySize = numbers.length;
        int lastIndexItem = arraySize - 1;

        System.out.println("------------------------------------------");
        int lastItemValue = numbers[lastIndexItem];
        System.out.println("Last Item Value(in original array) = " + lastItemValue);  // + number[lastIndexItem]

        System.out.println("------------------Middle Item ------------------");
        int middleItemIndex = arraySize/2;
        System.out.println("Middle Item Value = " + numbers[middleItemIndex]);    // + numbers[arraySize/2]


        int sum = 0;
        for (int i = 0; i < arraySize; i++) {
            int currentItem = numbers[i];
            sum = sum + currentItem;

          //  sum = sum + numbers[i];  (short way to do it)
        }
        System.out.println("Sum = " + sum);

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Maximum number is = " + max);

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("Minimum number is = " + min);


        System.out.println("~~~~~~~~~~~~~~~~~~~~Max Number with FOR EACH LOOP ~~~~~~~~~~~~~~~~~~");
        for (int myNumbers : numbers) {
            if (myNumbers > max) {
                max = myNumbers;
            }
        }
        System.out.println("Maximum number is = " + max);

        System.out.println("-------------------Min Number with FOR EACH LOOP --------------------");
        for (int myNumbers : numbers) {
            if (myNumbers < min){
                min = myNumbers;
            }
        }
        System.out.println("Minimum number is = " + min);












    }
}
