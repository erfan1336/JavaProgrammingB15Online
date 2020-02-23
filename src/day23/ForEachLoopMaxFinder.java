package day23;

public class ForEachLoopMaxFinder {
    public static void main(String[] args) {

        long[] salaries = new long[] {100000L,40000l, 115000l,6000l,153000l};

        long max = salaries[0];


        for (long salary : salaries ) {
            if (salary > max){
                max = salary;
            }
        }
        System.out.println("maxSalary = " +  max);
        System.out.println();


        for (long eachSalary : salaries){
            System.out.println("Each Salary = " + eachSalary);
        }


    }
}
