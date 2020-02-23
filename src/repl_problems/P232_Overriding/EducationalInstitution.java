package repl_problems.P232_Overriding;

public class EducationalInstitution {

    private int years;


    //Constructor based on requirement to initialize the value of duration instance variable
    public EducationalInstitution(int years){
        this.years = years;
    }


    public String graduationRequirements(){

        return this.years + " years of study";
    }


}
