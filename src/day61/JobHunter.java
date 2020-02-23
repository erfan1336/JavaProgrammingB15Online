package day61;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {

    public static void main(String[] args) {


        List<Job> myFabJobs = new LinkedList<>();
        myFabJobs.add(new Job("GA",110000,"BOA"));
        myFabJobs.add(new Job("VA",98000,"Chase"));
        myFabJobs.add(new Job("CA",120000,"Tesla"));
        myFabJobs.add(new Job("CA",128000,"Apple"));

        Collections.sort(myFabJobs);

        System.out.println("myFabJobs = " + myFabJobs);



    }
}
