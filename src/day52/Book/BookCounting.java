package day52.Book;

import java.util.Arrays;
import java.util.List;

public class BookCounting {

    public static void main(String[] args) {


        //reference type is Book, actual object type is PaperBook
        Book b1 = new PaperBook("Java","Akbar", 3 );
        System.out.println("B1 object type : " + b1.getClass().getSimpleName());

        Book b2 = new PaperBook("Selenium","Akbar", 2 );
        Book b3 = new AudioBook("Agile","Guljennet", 1.8);
        Book b4 = new PaperBook("The Kite Runner","Khalid Hosseini", 3 );
        Book b5 = new PaperBook("Lord of Rings","J.R.R Tolkien", 2000 );
        Book b6 = new AudioBook("Game of Thrones","George R.R Martin", 95.5 );


        List<Book> bookList = Arrays.asList(b1,b2,b3,b4,b5,b6);


        // counting how many paper book we have
        int paperBookCount = 0;
        for (Book each : bookList){
            //each.displayInfo();

            String className = each.getClass().getSimpleName();

            System.out.println(className);

            if (className.equals("PaperBook")){
                ++paperBookCount;
            }
        }
        System.out.println("Paper book count = " + paperBookCount);

        // we want to get the class type name using the object
        //obj.getClass().getSimpleName()


    }
}
