package day10;

public class calculator {
    public static void main(String[] args) {
        char operator = '*';

        switch (operator) {
            case '+':
                System.out.println("Its time to plus");
                break;
            case '-':
                System.out.println("Its time to minus");
                break;
            case '*':
                System.out.println("Its time to multiply");
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }


    }
}
