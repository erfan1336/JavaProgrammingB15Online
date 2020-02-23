package day48;

//Concrete class(fullTimeEmployee & hourlyEmployee) --> a non-abstract sub class of abstract super class
//this class is responsible provide (implementation) body for all abstract methods from super class
public class fullTimeEmployee extends Employee{

    //instance fields
    double monthlySalary;

    public fullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public void calculateAnnualSalary() {

        System.out.println(("Full Time Employee yearly = " + monthlySalary * 12));

    }

    @Override
    public String toString() {
        return "fullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                "Full Time Employee yearly = " + (monthlySalary * 12)+
                '}';
    }
}
