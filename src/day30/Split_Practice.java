package day30;

import java.util.Arrays;

public class Split_Practice {

    public static void main(String[] args) {

        String car = "Lexus - IS -F";
        String[] carSplitted = car.split("-",2);
        System.out.println("carSplitted = " + Arrays.toString(carSplitted));

        String brand = carSplitted[0];
        System.out.println("brand = " +brand);

        String model = carSplitted[1];
        System.out.println("model = " + model);
    }
}
