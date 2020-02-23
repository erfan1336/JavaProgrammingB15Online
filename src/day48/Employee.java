package day48;

/**
 * Warm up
 * ----------
 * abstract super class called Employee
 * instance fields : name , id
 * Constructor : to set all the fields
 * abstract methods :
 * 		calculateAnualSalary
 * 		toString
 * HourlyEmployee
 * instance fields :
 * 	hourlyWage , numsOfHours ,
 * Constructor : to set all the fields
 * instance methods ;
 * 	calculateAnnualSalary
 * 	toString
 * ----------------
 * FullTimeEmployee
 * 	instance fields :
 * 		 monthlySalary
 * Constructor : to set all the fields
 * instance methods ;
 * 	calculateAnualSalary
 * 	toString
 */

public abstract class Employee {

    String name;
    int id;


    //constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //methods
    public abstract void calculateAnnualSalary();
    public abstract String toString();

}
