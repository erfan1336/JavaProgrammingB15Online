package day08;

public class multiBranchIfStatement {

    public static void main(String[] args) {

        //given your current speed and speed limit
        // more than 90 --> jail
        // more than 80 and less than 90 --> reckless driving
        // more than 70 and less than 80 --> point taken
        // more than 60 and less than 70 --> warning

        int currentSpeed = 0;

        if (currentSpeed > 90){
            System.out.println("Jail Time");
        }else if (currentSpeed > 80 ){
            System.out.println("reckless driving");
        }else if (currentSpeed > 70){
            System.out.println("Point taken");
        }else if (currentSpeed > 60){
            System.out.println("warning");
        }else {
            System.out.println("keep driving");
        }




//        if(currentSpeed > 70){
//            System.out.println("Point Taken");
//        }else if(currentSpeed > 60 ){
//            System.out.println("your speed is more than 60 and less than 70");
//        }else {
//            System.out.println("keep driving, good to go");
//        }



    }
}
