package T17_Constructors;

public class tuna {
    private String girlName;

    //in order to make constructor, method name has to be exactly same as class name as ** tuna **
    public tuna(String name){
        girlName = name;
    }

    public void setName(String name){
        girlName = name;
    }

    public String getName(){
        return girlName;
    }

    public void saying(){
        System.out.printf("Your last last gf was %s. \n", getName());
    }
}
