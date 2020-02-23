package day48;


// This is the class to call the others and perform the task

public class HR_Action {

    public static void main(String[] args) {

        //abstract class not to create object to call it, otherwise it won't compile
       // Employee e1 = new Employee();

        hourlyEmployee e1 = new hourlyEmployee("Erfan", 101, 55, 2000);
        e1.calculateAnnualSalary();

        System.out.println("e1 = " + e1);


        fullTimeEmployee e2 = new fullTimeEmployee("Hamit", 102, 70000);
        e2.calculateAnnualSalary();

        System.out.println("e2 = " + e2);
    }
}
