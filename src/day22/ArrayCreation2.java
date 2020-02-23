package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {

        // creating an array in second way

        int[] ages;
              ages = new int[] {3,5,11,33,57,18};

        int itemCount = ages.length;
        System.out.println("ItemCount = " + itemCount);

        for (int i = 0; i < itemCount; i++) {
            System.out.println(ages[i]);
        }

        int[] areaCodes = {703, 300, 954, 666};  // !!!!! if you do this, It Must happen in one line
        for (int i = 0; i < areaCodes.length; i++) {
            System.out.print(areaCodes[i] + "  ");
        }

    }
}
