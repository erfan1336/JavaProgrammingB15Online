package day23;

public class StringArrayPractice {
    public static void main(String[] args) {

        String[] shows = {"Orville", "Gifted", "Game of Thrones", "Flash", "Arrow","Friends","Killer"};
        int showCount = shows.length;

        System.out.println("Shows Count = " + showCount);

        for (int i = 0; i <showCount ; i++) {

            String currentShow = shows[i];
            System.out.println(currentShow + " has character count = " + currentShow.length());

        }
    }
}
