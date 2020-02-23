package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR_Stuff {

    public static void main(String[] args) {

        //Employee is abstract super type
        //HourlyEmployee and FullTime employee is specific type

        Employee e1 = new hourlyEmployee("Subi",1012, 55,2000);

        //if we have Employee data type for e1 variable, we can write down the address of anything Is-A Employee

                e1 = new fullTimeEmployee("Hamit", 102, 70000);
                e1 = new hourlyEmployee("Erfan", 101, 55, 1805);

        hourlyEmployee e2 = new hourlyEmployee("Hamit", 101, 55, 1689);
        hourlyEmployee e3 = new hourlyEmployee("Patigul", 101, 55, 2000);

        //what is the easiest way to store these 3 objects together

        List<Employee> allEmployee = Arrays.asList(e1,e2,e3);
        for (Employee each : allEmployee){
            //System.out.println("each = " + each);

            System.out.print("Name is : " + each.name + ". ");
            each.calculateAnnualSalary();
        }


    }
}
