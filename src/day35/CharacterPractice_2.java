package day35;

public class CharacterPractice_2 {

    public static void main(String[] args) {


        char myChar = '7';
        //get int 7
        int myNum = Integer.parseInt(myChar + "");
        System.out.println("myNum = " + myNum);

        //Character.toString(myChar);
        //String.valueOf(myChar);        --->



        String str = "A34B123C4X";

        char[] allChars = str.toCharArray();

        int sum = 0;

        for (char each: allChars) {

            //checking whether each char is a number or not
            if (Character.isDigit(each)) {
                System.out.println("each = " + each);

                //parseInt only accept String, so we need to pass String by adding "" to each
                int eachNum = Integer.parseInt(each+"");
                sum = sum + eachNum;
            }
        }
        System.out.println("sum = " + sum);
    }
}
