import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cinemahall bashundhara = new Cinemahall(2000);
        Movie movie1 = new Movie("Hall of Fame", "Abu Sufian Shanto");
        Movie movie2 = new Movie("Inception", "Cristopher Nolan");
        Movie movie3 = new Movie("SpiderMan", "Faiaus Ahsan Arby");
        Movie movie4 = new Movie("Batman", "Alvina Akther Badhon");
        bashundhara.addMovie(movie1);
        bashundhara.addMovie(movie2);
        bashundhara.addMovie(movie3);
        bashundhara.addMovie(movie4);

        bashundhara.welcomeMsg();
        System.out.println("Right now in our hall these are running: ");
        System.out.println("-----------------------------------------------------");
        ArrayList<Movie> movies = bashundhara.getMovies();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println((i + 1) + ". " + movie.displayMovieInfo());
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Type 1/2/3/4 to watch movie: ");
        int movieChoice;
        Scanner input = new Scanner(System.in);
        movieChoice = input.nextInt();
        do {
            switch(movieChoice) {
                case 1 :
                    System.out.println("You have chosen ("+bashundhara.getMovies().get(0).getMovieName()+")");
                    break;
                case 2 :
                    System.out.println("You have chosen ("+bashundhara.getMovies().get(1).getMovieName()+")");
                    break;
                case 3 :
                    System.out.println("You have chosen ("+bashundhara.getMovies().get(2).getMovieName()+")");
                    break;
                case 4 :
                    System.out.println("You have chosen ("+bashundhara.getMovies().get(3).getMovieName()+")");
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        } while(movieChoice>1 && movieChoice<4);

    }
}
