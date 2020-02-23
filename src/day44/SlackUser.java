package day44;

/**
 * Create a class called SlackUser
 * attributes :
 * 	 name  ,  status (make it protected)
 * behaviours :
 * 	 sendMessage
 * 	 callSomeone
 * 	 addEmoji
 *
 * Create 1 subClass SlackAdminUser
 * attribute :
 * 	adminId
 * behaviour :
 * 	 sendAtChannelMessage
 * 	 deleteMessage
 * 	 addChannel
 * 	 toString method
 *
 * constructor :
 * 	 3 argument constructor to set all fields value
 */

public class SlackUser {

    protected String name;
    int phone;
    protected String status;

    public void sendMessage(){
        System.out.println("Slack user "+ name+ " sending message");
    }

    public void callSomeone(){
        System.out.println("Call user");
    }

    public void addEmoji(){
        System.out.println("Slack user " + name + "adding emoji");
    }
}
