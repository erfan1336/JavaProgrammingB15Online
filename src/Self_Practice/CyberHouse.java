package Self_Practice;

public class CyberHouse {

    int houseNum;
    String design;
    private static String neighbourhoodName = "Cybertek Avenue";

    public CyberHouse(int houseNum, String design){
        this.houseNum = houseNum;
        this.design = design;
    }

    public void showAllInfo(){
        System.out.println("House Number: " + this.houseNum + "; House Design: " + this.design + "; NeighbourhoodName: " + neighbourhoodName);
    }

    public static void showNeighbourhood(){
        System.out.println("Neighbourhood is " + neighbourhoodName);
    }

    public String toString() {
        return "CyberHouse{" +
                "houseNum=" + houseNum +
                ", design='" + design + '\'' +
                '}';
    }
}
