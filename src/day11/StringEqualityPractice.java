package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

        System.out.println("Java".equals("Java"));
        System.out.println("JAVA".equals("Java"));

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));
        System.out.println("Java".equals(myStr));

        String yourStr = new String("Java");

        //comparison
        System.out.println("Comparison = " + myStr.equals(yourStr));

        if (myStr.equals("Java")){
            System.out.println("correct word");
        }else {
            System.out.println("Say Java");
        }

    }
}
