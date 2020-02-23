package day46;

public class SavingAccount extends BankAccount{

    double interestRate;

    public SavingAccount(String accountHolder,long accountNumber, double balance,double interestRate){
        super(accountHolder,accountNumber,balance);
        this.interestRate = interestRate;
    }

    //Bad idea have main in here; just for testing purpose

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Erfan",12345678,500,0.0309);
        System.out.println("s1 = " + s1);

        s1.withDraw(100);
        System.out.println("s1 after penalty = " + s1);

        s1.deposit(100);
        System.out.println("s1 after save with interest rate = " + s1);
    }

    // we will override withdraw method to reflect the $30 penalty if its withdraw from saving account
    @Override
    public void withDraw(int amount){
        // balance -= amount;
        //balance = balance - amount - 30;
        super.withDraw(amount);
        super.withDraw(30);
    }

    @Override
    public void deposit(int amount){
        //balance += amount * interestRate;

        //cast into int variable, since deposit method only accept int
        int actualAmount = (int) (amount + amount*interestRate);
        super.deposit(actualAmount);

    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
