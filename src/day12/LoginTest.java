package day12;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter username:");
        String usrName = scan.nextLine();
        System.out.println("Please enter password:");
        String passWord = scan.nextLine();
        if (usrName.equals("user123") && passWord.equals("pass123")) {
            System.out.println("User accepted");
        } else if (!(usrName.equals("user123"))) {
            System.out.println("username was wrong");
        } else if (!(passWord.equals("pass123"))) {
            System.out.println("password is not correct");
        }
    }
}
