package day46;

public class AtBank {

    public static void main(String[] args) {

        CheckingAccount ch1 = new CheckingAccount("Hamit",12345,800);
        ch1.deposit(100);
        System.out.println("ch1 = " + ch1);
        ch1.deposit(5000);
        System.out.println("ch1 = " + ch1);
        ch1.deposit(5300);
        System.out.println("ch1 = " + ch1);
    }



}
