import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cinemahall bashundhara = new Cinemahall(2000);
        Movie movie1 = new Movie("Hall of Fame", "Abu Sufian Shanto");
        Movie movie2 = new Movie("Inception", "Cristopher Nolan");
        Movie movie3 = new Movie("SpiderMan", "Faiaus Ahsan Arby");
        bashundhara.addMovie(movie1);
        bashundhara.addMovie(movie2);
        bashundhara.addMovie(movie3);

        bashundhara.welcomeMsg();
        System.out.println("Right now in our hall these are running: ");
        System.out.println("-----------------------------------------------------");
        ArrayList<Movie> movies = bashundhara.getMovies();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println((i + 1) + ". " + movie.displayMovieInfo());
        }
        System.out.println("-----------------------------------------------------");




    }
}
