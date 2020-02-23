package day35;

public class Tomato_ParsePractice {

    public static void main(String[] args) {


        String sentence = "i bought 3 tomato and the price was 3,14 each";
        String strNum = sentence.substring(9,10);

        String[] allWords = sentence.split(" ");

        int count = Integer.parseInt(allWords[2]);

        String priceString =  allWords[allWords.length - 2];
               priceString = priceString.replace(",",".");
        double price = Double.parseDouble(priceString);

        System.out.println("Total Price is = " + (price * count));

        // oneshot

        //System.out.println(" = " + (Integer.parseInt(allWords[2])) *  (Double.parseDouble(allWords[allWords.length - 2])));


    }

}
