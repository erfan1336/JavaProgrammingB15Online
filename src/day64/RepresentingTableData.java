package day64;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepresentingTableData {

    public static void main(String[] args) {

        //for single row
        //i want to get the value by it's column name
        //so i choose Map

        Map< String, String > row1 = new HashMap<>();
        row1.put("first_name", "Regan");
        row1.put("email", "rboihcat@1688.gom");
        row1.put("gender","Female");

        Map<String,String> row2 = new HashMap<>();
        row2.put("first_name", "Carleen");
        row2.put("email", "Carleen@1688.gom");
        row2.put("gender","Male");


        //many of Some type -->> List<SomeType>
        List<Map< String, String> > rowMaplst = new ArrayList<>();
        rowMaplst.add(row1);
        rowMaplst.add(row2);

        System.out.println("row1 = " + row1);
        System.out.println("row2 = " + row2);

        System.out.println("rowMaplst = " + rowMaplst);


        System.out.println("rowMaplst.get(1).get(\"email\") = " + rowMaplst.get(1).get("email"));

        //update the Name of 1st row to Hulk
        rowMaplst.get(0).replace("first_name","Hulk");

        rowMaplst.get(0).put("first_name", "jane");
        System.out.println("rowMaplst = " + rowMaplst);


    }
}
