package repl_problems;

public class P217_MethodsWithArray {

    public static void main(String[] args) {


        int[] arrayA = {1,1,1,1,0,0,0,0,0};
        boolean results = badP(arrayA,3);
        System.out.println("results = " + results);

    }

    public static boolean badP(int[] products, int limit){

        boolean result;
        int countOfDefects = 0;
        for (int i = 0; i < products.length ; i++) {
            if (products[i] == 0 ){
                countOfDefects++;
            }
        }
        if (countOfDefects > limit){
            result = false;
        }else {
            result = true;
        }
        return  result;
    }
}


