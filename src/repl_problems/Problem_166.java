package repl_problems;

public class Problem_166 {

    public static void main(String[] args) {

    c_profits (100,105);

    }

    public static void  c_profits(int buyPrice, int sellPrice)
    {
        //your code here


        if (buyPrice > sellPrice){
            System.out.println("loss");
        } else if (buyPrice < sellPrice) {
            System.out.println("profit");
        }else if ( buyPrice == sellPrice){
            System.out.println("no loss");
        }



    }
}
