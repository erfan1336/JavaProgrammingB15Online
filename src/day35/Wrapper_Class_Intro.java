package day35;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Wrapper_Class_Intro {

    public static void main(String[] args) {
        int x = 10;
        // primitive data types are pure value has no attribute nor behavior

        //each primitive type has wrapper class that turn it into object so we can treat it as object

        // this is the old not recommended way of create Integer Object, Deprecated or expired way
        Integer xObject1 = new Integer(10);

        //value of method of Integer Class
        //--> return a integer object by wrapping up the value you passed
        // it has 2 overloaded version: one that accepts int, another accept String
        Integer xObject2 = Integer.valueOf(10);
        Integer xObject3 = Integer.valueOf("10");

        byte bValue = xObject2.byteValue();
        double dValue = xObject2.doubleValue();


        //Use this number IPR2012-00001 and store the year into a int variable
        //This case number always starts with 3 character either IPR or PGR, CBM, DEM, followed by year
        //followed by dash and 5 digit number
        String caseNumber = "IPR2012-00001";
        int year;

        String strYear = caseNumber.substring(3,7);
        year = Integer.parseInt(strYear);
        System.out.println("strYear = " + strYear);


        System.out.println(getYearOutOfCaseNumber("DER2019-00034"));
        System.out.println(getYearOutOfCaseNumber("IPR2019-012343"));
        System.out.println(getYearOutOfCaseNumber("CBM2001-10232"));

    }

    public static int getYearOutOfCaseNumber(String caseNumber){
        return Integer.parseInt(caseNumber.substring(3,7));
    }
}
