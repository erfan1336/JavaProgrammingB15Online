package day19;

public class FindingTheCountofSomething {

    public static void main(String[] args) {

        // from 1-100 print out all the numbers can be divided by 15 without remainder

        // from 1-100 count how many numbers can be divided by 15?

        int counter = 0;
        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
            //sum = sum + i;

            sum += i;
            if (i % 15 == 0){
                System.out.print(i + " ");
                ++counter;
            }

        }
        System.out.println();
        System.out.println("Sum is = " + sum);
        System.out.println("Counter is = " + counter);

        System.out.println("----------------------------------letter counter inside the name-----------------------");
        //given a string with value
        //find out how many <a> showed up in this string

        String name = "ErfanHamitAblikem";
        int countOfa = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a') {
                ++countOfa;
            }
        }
        System.out.print("Total count of letter a = " + countOfa);
    }
}
