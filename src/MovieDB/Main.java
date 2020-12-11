package MovieDB;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of movies you want to review: ");
        int movieQuanity = input.nextInt();
        System.out.print("Enter number of reviewers: ");
        int reviewerQuantity = input.nextInt();

        MovieDB movieDB = new MovieDB(movieQuanity, reviewerQuantity);
        movieDB.fillDatabase();

        movieDB.printAverageMovieRating();
        movieDB.printAverageReviewerRating();

    }
}
