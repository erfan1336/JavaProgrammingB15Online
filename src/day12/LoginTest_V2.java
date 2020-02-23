package day12;

public class LoginTest_V2 {
    public static void main(String[] args) {
        String userName = "Erfan Hamit";
        boolean userNameCorrect = userName.equals("Erfan Hamit");
        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("erfan hamit");
        System.out.println(nameCheckIgnoreCase);
    }
}
