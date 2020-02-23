package day27;

public class Multi_Array_Practice_devops {

    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav","Erfan", "Hamit", "Abide"};
        String[] testerTeam = {"Mohammed Sohrabi", "Nursultan", "Zhibekchach"};
        String[] businessAnalyst = {"Lisa", "Ershad","Gulzar"};

        String[][] scrumTeam = {developersTeam, testerTeam,businessAnalyst};

        System.out.println("=================== For Each Loop =============================");

        int maxLength = scrumTeam[0][0].length();

        String longestString = "";

        for (String[] eachArray : scrumTeam){
            for (String eachName : eachArray){
                if (eachName.length() > maxLength){
                    maxLength = eachName.length();
                    longestString = eachName;
                }
            }
        }
        System.out.println(maxLength);
        System.out.println("Longest Name is = " + longestString);



    }
}
