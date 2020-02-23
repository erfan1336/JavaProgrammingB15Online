package Tutorial16_manyMethods;

public class tuna {
    private String girlName;
    public void setName(String name){
        girlName = name;
    }

    //make a method to access it
    public String getName(){
        return girlName;
    }

    //final output
    public void saying(){
        System.out.printf("Your first gf was %s", getName());

    }
}
