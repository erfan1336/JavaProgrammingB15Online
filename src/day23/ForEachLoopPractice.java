package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        long[] salaries = new long[] {100000L,40000l, 115000l,6000l,153000l};

        for (long eachSalary : salaries){
            System.out.println("Each Salary = " + eachSalary);
        }


        for (long salary : salaries){
//            if (salary > 130000){
//                System.out.println("Salary = " + salary);
//            }

            //how can i skip the salaries less than or equal to 10000
            if (salary <= 100000){
                continue;
            }
            System.out.println("salary = " + salary);
        }
    }
}
