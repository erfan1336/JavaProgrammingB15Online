package day44;

public class CyberHouse {

    private int houseNum;
    private String design;

    // We can change default value of the fields by assigning value directly in the template class
    static String neighbourhoodName =" Ghulja Avenue" ;


    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }

    public void ShowAllInfo(){
        System.out.println(this.houseNum + "------ " + this.design + " ----  "+neighbourhoodName);
    }

    public static void showNeighbourhoodName(){
        System.out.println("neighbourhoodName = " + neighbourhoodName);

        // Cannot access anything non-static inside the static method, for example:
        //System.out.println("houseNum = " + houseNum);
    }
}
