package day52.Book;

public class PaperBook extends Book implements Readable {

    int weight;


    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book name is : " + name + ", and the author is : " + author
        + "and it weight = " + weight + " pounds");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNotes(){
        System.out.println("Taking note from " + name);
    }

    @Override
    public void read() {

    }
}
