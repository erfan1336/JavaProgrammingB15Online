package day34;

public class Overloading_Practice {

    // create 4 overloaded version of add method
        //1. has 1 int parameter and add 100 to that number and printout the result
        //2. has 2 int parameters and add them to get sum and print out the result
        //3. has 3 int parameters and add them to get sum and print out the result
        //4. has 2 long parameters and add them to get sum and print out the result

    public static void main(String[] args) {

      add(5);
      add(5,9);
      add(44,6,10);
      add(15L,20L);

    }



    public static void add(int num){
        System.out.println(num+100);
    }

    public static void add(int a, int b){
        System.out.println(a + b);
    }

    public static void add(int x, int y, int z){
        System.out.println(x + y + z);
    }

    public static void add(long l2, long l3){
        System.out.println(l2 + l3);
    }

















//
//    public static int sum(int num){
//        return sum(num+num);
//    }
//
//    public static int sum(int num1,int num2){
//        return sum(num1 + num2);
//    }
//
//    public static int sum(int num1, int num2, int num3){
//        return sum(num1+num2+num3);
//    }

//    public static long sum(long num5, long num6){
//        return sum(num5+num6);
//    }


}
