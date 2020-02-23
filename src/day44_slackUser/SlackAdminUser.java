package day44_slackUser;
import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminID;

    //add constructor
    public SlackAdminUser(String name, String status, int adminID){
        this.adminID = adminID;
        this.name = name;
        this.status = status;
    }

    public static void main(String[] args) {
        SlackAdminUser user1 = new SlackAdminUser("Erfan", "release your horse",12345);
        //---inherited methods we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();

        //--- our own methods we are calling
        user1.addChannel();
        user1.deleteMessage();
        user1.sendAtChannelMessage();
        System.out.println("user 1 : " +user1);
    }

    public String toString() {
        return "SlackAdminUser{" +
                "adminID=" + adminID +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /**
     *  behaviour :
     *  * 	 sendAtChannelMessage
     *  * 	 deleteMessage
     *  * 	 addChannel
     *  * 	 toString method
     */

    public void sendAtChannelMessage(){
        System.out.println("sending message");

    }

    public void deleteMessage(){
        System.out.println("delete message");
    }

    public void addChannel(){
        System.out.println("add Channel");
    }
}
