package day57;

public class CatchPractice {

    public static void main(String[] args) {

        try {
            System.out.println(" In second Try Block ");
            String str = "java is fun";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        }catch (Exception e){
            System.out.println("Exception happened in Try Block and caught!");
        }

        System.out.println("After Second Try Catch");
    }
}
