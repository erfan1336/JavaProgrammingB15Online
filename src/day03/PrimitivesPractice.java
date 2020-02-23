package day03;

public class PrimitivesPractice {

    public static void main(String[] args) {

        int catCount = 20;
        System.out.println("The cat count is " + catCount);

        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount);
        short sheepCount = 300;
        System.out.println("The sheep count is  " + sheepCount);

        long milesToMoon = 50000l;
        System.out.println("Distance to moon is " + milesToMoon);

        long milesToSun = 10000000L;
        System.out.println("Distance to sun is " + milesToSun);

        //-------------------floating point-------------
        //you must add f, to indicate this is float data type
        //uppercase lowercase doest not matter, but its mandatory

        float priceOfBanana = 1.99f;
        System.out.println("Price of banana is " + priceOfBanana);
        float priceOfTomato = 2.49F;
        System.out.println("Price of Tomato is " + priceOfTomato);

        //---------------larger floating point numbers-----------
        double priceOfIpad1 = 355.99d;
        System.out.println("The price of Ipad1 is " + priceOfIpad1);
        double priceOfIpadPro = 1025.99D;
        System.out.println("The price of IpadPro is " + priceOfIpadPro);

        //compiler automatically assume it's a double so its not required to have d
        //however for good programming habit, add them always
        double priceofMac = 2200.99 ;
        System.out.println("Price of Macbook is " + priceofMac);

        //If you have a whole number by itself, compiler automatically assume it's an integer
        //If you have a fractional number, compiler automatically assume it's an double




    }
}
