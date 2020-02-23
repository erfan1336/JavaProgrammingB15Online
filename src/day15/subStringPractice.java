package day15;

public class subStringPractice {
    public static void main(String[] args) {
                     // 0123456789012345
        String movie = "Lord of The Ring";
                     // 1234567890123456

        String wordRing = movie.substring(12);
        System.out.println(wordRing);
        String wordOfThe = movie.substring(4,10);
        System.out.println(wordOfThe);
        String wordLord = movie.substring(0,3);
        System.out.println(wordLord);


        String secondWorldTillLast = movie.substring(5,16);   //it doesn't work if its till 17
        System.out.println("Second Word Till Last: " + secondWorldTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println("Word Lord Of: " + wordLordOf);


        // if you provide only parameter into substring method,
        // it will just start from that location till the end
        String secondToLast = movie.substring(5);
        System.out.println("Second to last word: " + secondToLast);

        // Turn:   Lord Of The Ring --> Ring Of The Lord
        System.out.println(movie.substring(12) + movie.substring(4,12) + movie.substring(0,4));

        System.out.println(wordRing + wordOfThe + wordLord);

    }
}
