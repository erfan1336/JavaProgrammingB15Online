package day20;

public class Get2SibingChar {
    public static void main(String[] args) {

        /*
                       0123  <--index
                       1234  <--length
         for example : Ayra
         result:
                Ay     01    --> substring(0,2)
                yr     12    --> substring(1,3)
                ra     23    --> substring(2,4)
         */

        String name = "Ayra";
        System.out.println(name.substring(2,4));

        int lastCharIndex = name.length()-1;

        System.out.println(name.substring(0,2));
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(2,4));

        System.out.println("-----------------------------------");


        for (int x = 0; x <= lastCharIndex -1; x++){
            System.out.println(name.substring(x, x + 2));
        }

        /*
          for example  0123
                       Ayra
                 Ayr 012 --> 03
                 yra 123 -->14
         */
        System.out.println("Getting Three Character");
        for (int i = 0; i <= lastCharIndex -2; i++){
            System.out.println(name.substring(i, i+3));
        }
    }
}
