import java.util.ArrayList;

public class Cinemahall {

    User user = new User("Abu Sufian Shanto", 23);
    private int totalSeat;
    private ArrayList<Movie> movies;
    public Cinemahall(int totalSeat) {
        this.totalSeat = totalSeat;
        movies = new ArrayList<>();
    }

    public void welcomeMsg() {
        System.out.println("Hello "+user.getFullName()+",\nWelcome to Bashundhara Complex Cinema Hall\n");
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
