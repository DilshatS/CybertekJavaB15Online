package day42;

public class Movie {

    String name;
    double length;
    String genre;

    public Movie(){
        System.out.println("EMPTY MOVIE");
    }

    // write a constructor to set all the fields value

    public Movie(String name, double length, String genre){
        this.name = name;
        this.length = length;
        this.genre = genre;
    }

    // toString method so we can directly print out


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
