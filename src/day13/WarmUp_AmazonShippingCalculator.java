package day13;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {
        String memberType = "not a Prime Member";
        double amount = 45.99d;
        int shippingFee = 0;

        if(memberType.equalsIgnoreCase("Prime Member")) {
            System.out.println("Shipping fee is free");
            System.out.println("Your final price is " + amount);

        //else if (!memberType.equalsIgnoreCase("Prime Member") && amount > 25)

        }else if (amount > 25){
            System.out.println("You are not Prime Member, you got free shipping since your order is more than 25");
            System.out.println("You final price is " + amount);
        }else {
            System.out.println("Do you wanna sign up for prime membership?");
            shippingFee = 5;
            amount = amount + shippingFee;
            System.out.println("Your final amount is: " + amount);
        }

    }
}
