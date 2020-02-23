package day53;

public class FruitShopUtility {


    public static void main(String[] args) {

        Fruit f1 = new Apple("cispy but", "hot red","gala");
        Fruit f2 = new Orange("sour", "orange" , 12);

        displayFruit(f1);
        displayFruit(f2);

        digestBetter(f1);
        digestBetter(new Apple("xxx","yyy","zzz"));

        Fruit x = getMyFavoriteFruit();
        System.out.println("x = " + x);
        x.getDigest();

        System.out.println("getFavoriteByType(1) = " + getFavoriteByType(1));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType(3) = " + getFavoriteByType(3));

    }


    //create a Static void method called digestBetter
    //it has a parameter as type Fruit
    //and inside the method, it will digest the Fruit object 4 time then
    //displayInformation

    public static void digestBetter(Fruit anyFruit){
        anyFruit.getDigest();
        anyFruit.getDigest();
        anyFruit.getDigest();
        anyFruit.getDigest();

        System.out.println("anyFruit = " + anyFruit);
    }

    //Create a static method called getMyFavoriteFruit
    //accept no parameter and return your Favorite Fruit Object

    public static Fruit getMyFavoriteFruit(){
//        Fruit f = new Orange("crispy","green",100);
//        return f;

        return new Orange("crispy","green",100);
    }

    //Create a static method called getFavoriteByType
    //it has one int parameter
    //return favorite apple object if type is 1 , orange object if type2

    public static Fruit getFavoriteByType(int type){
        if (type == 1){
            return new Apple("cispy but", "hot red","gala");
        }else if (type == 2){
            return new Orange("crispy","green",100);
        }else {
            return null;
        }
    }

    //displayFruits
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Displaying nice super fruit : \n " + anyFruit.toString());
    }



    //sellFruit




    //buyFruit
}
