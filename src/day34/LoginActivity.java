package day34;

public class LoginActivity {
    public static void main(String[] args) {

        //create 2 login method:

        //1.login1 static void method
        // login1 ("user name","abc123");

        login_Void("userNma" , "abcgd123");

       // System.out.println(login_Void("aaaa","ghrbe1")); //can not do it with void method





        //2.login2 static boolean method

        boolean result = login_Return("user","abc123");
        System.out.println("result = " + result);


    }

    public static void login_Void(String user, String password){
        if (user.equals("user") && password.equals("abc123")){
            System.out.println("Log In Successful");
        }else {
            System.out.println("Log In Failed");
        }

    }



    public static boolean login_Return(String user, String password){

//        if (user.equals("user") && password.equals("abc123")){
//            return true;
//        }else {
//            return false;
//        }

        return user.equals("user") && password.equals("abc123");

    }
}
