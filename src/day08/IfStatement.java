package day08;

public class IfStatement {

    public static void main(String[] args) {
        int speedLimit = 60;
        int yourCurrentSpeed = 60;

        //if the current speed is more than speed limit
        //get pulled over by the police
        //given ticked by police
        //taken way some points
        //go to court

        boolean amIspeeding = (yourCurrentSpeed > speedLimit);

        if(amIspeeding){
            System.out.println("pulled over by police");
        }else {
            System.out.println("go shopping");
        }

        //if not over the limit
        //go shopping!

        //outside if statement, say the end

    }
}
