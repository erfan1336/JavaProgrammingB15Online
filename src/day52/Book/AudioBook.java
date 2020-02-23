package day52.Book;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    public void listen(){
        System.out.println("listening the audio book " + name + "by " + author);
    }

    @Override
    public void displayInfo() {

        System.out.println("Author is "+author+ " Name of Book is "
                + name+" Duration "+duration);
    }

    @Override
    public void takeNotes() {

        System.out.println("Taking notes on the digital book by " + name +
                "writing the provided digital table");
    }

    @Override
    public void showTableOfContent() {

        System.out.println("If you wanna see Agile books content.");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
