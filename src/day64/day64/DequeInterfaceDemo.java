package day64.day64;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterfaceDemo {

    public static void main(String[] args) {

        //LIFO -- last in first out queue
        //Deque is a double ended Queue so we can add item as always
        //and when we remove we can use removeLast last method to achieve Last in first out

        Deque<String> lifoQue = new LinkedList<>();
        lifoQue.add("review class");
        lifoQue.add("do your homework");
        lifoQue.add("attend the class");
        lifoQue.add("say by to java");

        System.out.println("New version after adding for github test");
        System.out.println("adding new one");
        System.out.println("adding new one line here");
        System.out.println("adding new one line here");
        System.out.println("adding new one line here");
        System.out.println("adding new one line here");
        System.out.println("adding new one line here");
        

        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());

        System.out.println("lifoQue = " + lifoQue);
    }
}
