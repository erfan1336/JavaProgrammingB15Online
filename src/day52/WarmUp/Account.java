package day52.WarmUp;

public class Account implements Transferable {

    protected String name;
    private int balance;

    public Account(String name, int balance){
        this.name = name;
        this.balance= balance;

    }

    @Override
    public void transferAll(Account otherAccount){

        //logic is get the balance of the current account deposit into other account and
        //set current account balance to 0

        /*
        //first easy way:
        //get the balance of the current account
        otherAccount.balance += this.balance;

        //set current account balance to 0
        this.balance = 0;

        */

        //or optionally use the method :
        otherAccount.deposit(this.balance);
        this.withdraw(this.balance);


    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }


    //add a method called isPalindrome and return true if the name is palindrome
    public boolean isPalindrome(){

        //first store the name in temp and then convert into lowercase also remove the space
        String nameCopy = this.name.toLowerCase().replace(" ","");

        //we need to reverse the values then check whether they are still same String or not
        String reverseResult = "";
        for (int i = nameCopy.length() -1 ; i >= 0 ; i--) {
            reverseResult += nameCopy.charAt(i);
        }

        return nameCopy.equals(reverseResult);
    }
}
