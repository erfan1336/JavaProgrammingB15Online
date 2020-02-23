package repl_problems;

import java.util.Scanner;

/*
  Example:
input: abXYabc
input: 2
output: true
ab appears twice

Example:
input: abXYabc
input: 3
output: false
abX appears once only

0123456789
erfanhamit
1
substring(0,1)

2
substring(0,2)

9
substring(0,9)
substring(0,n) or (0,length-1)

 --> substring(0,length-1)  --if i starts from 0 -- it can only reach
up to (length-1)

//0123456789
//ASATTURHUN
//1234567890  <---n

//substring(0,1) --> AS
//substring(0,2) --> ASA
//substring(0,10)  --

 */

public class P99_PrefixAgain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string: ");
        String str = scan.next();
        System.out.println("Please enter the number: ");
        int n = scan.nextInt();

        int length = str.length();

        int counter = 0;
        boolean outPut = true;
        for (int i = 0; i <length-n ; i++) {
            String str2 = str.substring(0, n);

            if (str2.equals(str.substring(i, n + i))) {
                counter++;
            }

        }
        if (counter >= 2) {
            System.out.println("it appeared " + counter + " times");
            System.out.println(outPut = true);
        } else if (counter <= 1) {
            System.out.println("it appeared once only ");
            System.out.println(outPut = false);
        }
    }
}

