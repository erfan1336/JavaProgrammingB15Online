package day20;

public class WorkingWithMoreThanOneCharacter {
    public static void main(String[] args) {

        /*
        given a string with even number character
        print two characters in one line
                     01234567
        for example: Gokyuzum
        result :
                Go  01    substring(0,2)
                ky  23             (2,4)
                uz  45             (4,6)
                um  67             (6,8)
         */

        String name = "Gokyuzum";
        int charCount = name.length();         // length is same as the charCount
        int lastCharIndex = charCount - 1;

        System.out.println(charCount);


        System.out.println(name.substring(0,2));
        System.out.println(name.substring(2,4));
        System.out.println(name.substring(4,6));
        System.out.println(name.substring(6,8));

        int x = 0;
        System.out.println(name.substring(x,x+2));
        x = x + 2;
        System.out.println(name.substring(x,x+2));
        x = x + 2;
        System.out.println(name.substring(x,x+2));
        x = x + 2;
        System.out.println(name.substring(x,x+2));

        //my condition is x <= charCount - 2;  or lastCharIndex - 1
        // my condition is x <= charCount
        /*
                          012345678
                          Gokyuzum
                          12345678



         */
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        //for (int x= 0; x <= lastCharIndex - 1; x+= 2)  //we can also use this one

        for (int i = 0; i <= charCount -2 ; i += 2 ){        //important to understand the increments
            System.out.println(name.substring(i,i+2));
        }




    }
}
