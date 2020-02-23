package day37;

import java.util.ArrayList;
import java.util.List;

public class FindTheLongestWordInArrayList {

    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<>();

        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Almirdinan");
        nameLst.add("Gulxaniain");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        System.out.println("nameLst = " + nameLst);

        //find the longest name

        String logestName = nameLst.get(0);

        for (int i = 0; i < nameLst.size(); i++) {
            if (nameLst.get(i).length() > logestName.length()){
                logestName = nameLst.get(i);
            }
        }
        System.out.println("longestName = " + logestName);

        // >= will give you last longest Name if there is more than one
        for(String eachName : nameLst){
            if (eachName.length() >= logestName.length()){
                logestName = eachName;
            }
        }
        System.out.println("longestName = " + logestName);


        //find out all the longest words if there are more than one

        System.out.println("============ find out all the longest words if there are more than one =============");
        for (int i = 0; i <nameLst.size() ; i++) {
            if (nameLst.get(i).length() == logestName.length()){
                System.out.println("nameLst = " + nameLst.get(i));
            }
        }

    }
}
