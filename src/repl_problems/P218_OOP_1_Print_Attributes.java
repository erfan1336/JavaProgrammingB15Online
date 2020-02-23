package repl_problems;

public class P218_OOP_1_Print_Attributes {

    public static void main(String[] args) {

        Atts a = new Atts();
        a.name = "ball";
        a.color = "red";
        a.amount = 1;

        System.out.println(a.asString());
    }
}
