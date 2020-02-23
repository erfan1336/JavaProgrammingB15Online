package day52.Book;

public interface KnowledgeBank {

    public abstract void takeNotes();

    public default  void showTableOfContent(){
        System.out.println("chapter 1 till chapter 10 : you do the rest. ");
    }
}
