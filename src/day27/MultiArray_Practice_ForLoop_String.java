package day27;

public class MultiArray_Practice_ForLoop_String {

    public static void main(String[] args) {

        System.out.println("======================== For Loop =====================================");


        String[] developersTeam = {"Vladislav","Erfan", "Hamit", "Abide"};
        String[] testerTeam = {"Mohammed Sohrabi", "Nursultan", "Zhibekchach"};
        String[] businessAnalyst = {"Lisa", "Ershad","Gulzar"};

        String[][] scrumTeam = {developersTeam, testerTeam,businessAnalyst};

        int minLength = scrumTeam[0][0].length();
        int maxLength = scrumTeam[0][0].length();

        String minName = "";
        String maxName = "";

        for (int i = 0; i <scrumTeam.length ; i++) {
            for (int j = 0; j < scrumTeam[i].length ; j++) {  // pay attention that its NOT scrumTeam[i][j].length()
                    if (minLength > scrumTeam[i][j].length()){
                        minLength = scrumTeam[i][j].length();
                        minName = scrumTeam[i][j];
                    }


            }
        }

        System.out.println("Shortest = " + minLength);
        System.out.println("Shortest name is =  " + minName);
    }
}
