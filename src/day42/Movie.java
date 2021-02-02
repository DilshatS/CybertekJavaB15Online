package day42;

public class Movie {

    private String name;
    private double length;
    private String genre;

    public Movie(){

        System.out.println("EMPTY MOVIE");
    }

    // default constructor:
    // a constructor that give by compiler
    // only if you don't have any in your class
    // it's invisible
    // and it has parameter
    // it has no code inside

    // write a constructor to set all the fields value

    public Movie(String name, double length, String genre){
        this.name = name;
        this.length = length;
        this.genre = genre;
    }

    // toString method so we can directly print out


    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getGenre() {
        return genre;
    }

    public String getType() {
        return null;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }

}
