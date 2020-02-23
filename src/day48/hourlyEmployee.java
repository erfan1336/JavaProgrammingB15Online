package day48;

public class hourlyEmployee extends Employee {

    //instance fields
    double hourlyWage;
    int numsOfHours;

    public hourlyEmployee(String name, int id, double hourlyWage, int numsOfHours) {
        super(name, id);            //<---call from super class constructor
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;
    }

    @Override
    public void calculateAnnualSalary() {

        System.out.println("Hourly Employee yearly: " + (hourlyWage*numsOfHours));
    }

    @Override
    public String toString() {
        return "hourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                "yearly salary = " + (hourlyWage * numsOfHours) +
                '}';
    }
}
