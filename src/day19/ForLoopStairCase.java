package day19;

public class ForLoopStairCase {

    public static void main(String[] args) {
        String star = " ";
        for (int i = 0; i < 15; i++) {

            star += "*";
            System.out.println(i + " " +star);

        }

        for (char iChar = 'A'; iChar <= 'Z'; iChar++){
            System.out.print(iChar + " ");
        }

        System.out.println();

        for (char kChar = 'Z'; kChar >= 'A'; kChar--){
            System.out.print(kChar + " ");
        }

        String line = "";
        for (char zChar = 'A'; zChar <= 'Z'; zChar++){
            line = line + zChar;
            System.out.println(line);
        }


    }
}
