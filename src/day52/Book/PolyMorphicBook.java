package day52.Book;

public class PolyMorphicBook {

    public static void main(String[] args) {


        // we can refer the paper book object using
        //-------its own type: PaperBook;
        //-------or its super type : Book, Readable, KnowledgeBank, Object


        Book b1 = new PaperBook("Java","Akbar", 3 );
        b1.displayInfo();



        // this is very similar idea as putting small coffee cup into grande cup
        KnowledgeBank kb = b1;
        kb.takeNotes();
        kb.showTableOfContent();
        System.out.println("-------------------------------------------------");

        Book b2 = new PaperBook("Selenium","Akbar", 2 );


        Book b3 = new AudioBook("Agile","Guljennet", 1.8);
        b3.showTableOfContent();
        b3.displayInfo();
        System.out.println("b3 = " + b3);

        Book b4 = new PaperBook("The Kite Runner","Khalid Hosseini", 3 );
        Book b5 = new PaperBook("Lord of Rings","J.R.R Tolkien", 2000 );
        Book b6 = new AudioBook("Game of Thrones","George R.R Martin", 95.5 );
    }
}
