package day33;

public class WarmUp {

    public static void main(String[] args) {


        // first way to print out
        String spelledName = getSpelledName("Erfan Hamit");
        System.out.println("Spelled Name = " + spelledName);


        //another way to print it
        System.out.println(getSpelledName("Srra"));
    }

    /*
    Create method getSpelledName
    This method will put dash in between given String
    for example : Erfan -->> E-r-f-a-n
    @param name this the name parameter
    @return the name has dash in between
     */

    public static String getSpelledName(String name){

        String result = "";


        for (int i = 0; i <name.length() ; i++) {
            result = result + name.charAt(i);
            if (i != name.length()-1){
                result = result + "-";
            }
        }
        return result;
    }
}
