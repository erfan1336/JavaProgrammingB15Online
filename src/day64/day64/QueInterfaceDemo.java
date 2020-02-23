package day64.day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueInterfaceDemo {

    public static void main(String[] args) {


        //FIFO - first in first out queue
        //whichever comes first, it will get removed first when we use remove method from the Queue interface
        Queue <String> taskQueue = new LinkedList<>();
        taskQueue.add("Review the class");
        taskQueue.add("Do your homework");
        taskQueue.add("Attend the class");
        taskQueue.add("Say bye to Java");

        System.out.println("taskQueue = " + taskQueue);

        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue = " + taskQueue);

    }
}
