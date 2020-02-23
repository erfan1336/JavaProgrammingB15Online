package day46;

public class JavaProgrammer extends Programmer{

    @Override
    public void code() {
        System.out.println("I code Java");
        //super.code();
    }

    @Override
    public void test() {
        super.test();
        System.out.println("We do testing ");
    }

    public void drinkCoffe(){
        System.out.println("We drink coffee");
    }
}
