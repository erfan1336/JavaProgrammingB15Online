package Self_Practice;

public class CyberHouseBuilder {

    public static void main(String[] args) {

         CyberHouse house1 = new CyberHouse(18888, "Vintage");
         CyberHouse house2 = new CyberHouse(66666, "Classic");

         house1.showAllInfo();
         house2.showAllInfo();

         CyberHouse.showNeighbourhood();

    }
}
