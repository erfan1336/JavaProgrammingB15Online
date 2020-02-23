package day12;

public class carShopping {

    public static void main(String[] args) {

        String carBrand = "Honda";
        int carPrice = 350000;
        int budget = 40000;

        if (carBrand.equals("Corolla") || (carBrand.equals("Tesla") && carPrice < budget) ){
            System.out.println("Car Acquired");
        }else {
            System.out.println("Not what i am looking for");
        }


//        if (carBrand.equals("Corolla")){
//            System.out.println("Car Acquired");
//        }else if (carBrand.equals("Tesla") && carPrice <= budget){
//            System.out.println("Car ACQUIRED");
//        }else {
//            System.out.println("Not what i am looking for");
//        }

    }
}
