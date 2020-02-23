package day41;

/**
 *
 * turnOn
 * turnOff
 * getCurrentChannel
 * setCurrentChannel (newChannelNumber)
 * moveForward
 * moveBackward
 *
 */

public class TV {

    String name;
    boolean isOn;
    int currentChannel;

    public int getCurrentChannel(){
        return currentChannel;
    }

    public void setCurrentChannel(int newChannel){

        if (isOn == true){
            currentChannel = newChannel;
        }else {
            System.out.println("Please Turn On the TV First");
        }

    }

    public void turnOn(){

        if (isOn == false){
            System.out.println("Turning on TV");
            isOn = true;
        }
    }

    public void turnOff(){
        if (isOn == true){
            System.out.println("Turning off TV");
            isOn = false;
        }
    }

    public String Erfan() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
