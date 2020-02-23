package day42;

public class Movie {
    private String name;
    private double length;
    private String type;


    //Default constructor --> that given by compiler, on ly if you don't have any in your class, its invisible, it has no parameter, no code inside
    public Movie(){
        System.out.println("Empty Movie");
    }

    // write a constructor to set all the fields value
    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }


    //Create getter:


    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    //toString method so we can directly print out
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
