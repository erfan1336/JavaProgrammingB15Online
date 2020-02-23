package day05;
import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the temperature in(F): ");
        double fahrenheit = scan.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Fahrenheit: " + fahrenheit + "; in Celsius is: " + celsius);




    }
}
