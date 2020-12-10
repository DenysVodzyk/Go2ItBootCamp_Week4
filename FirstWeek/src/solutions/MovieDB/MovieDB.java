package solutions.MovieDB;

import java.util.Scanner;

public class MovieDB {
    private int movie;
    private int reviewer;
    private int[][] dataBase;
    private Scanner input;

    public MovieDB(int movie, int reviewer) {
        this.movie = movie;
        this.reviewer = reviewer;
        this.dataBase = new int[this.movie][this.reviewer];
        this.input = new Scanner(System.in);
    }

    public int getMovieCount() {
        return movie;
    }

    public int getReviewerCount() {
        return reviewer;
    }

    public int[][] getDataBase() {
        return dataBase;
    }

    public void fillDatabase() {
        int rating;
        for (int i = 0; i < getMovieCount(); i++) {
            System.out.println("Movie to be rated: " + i);
            for (int j = 0; j < getReviewerCount(); j++) {
                System.out.println("Reviewer " + j + ", please enter your rating for movie # " + i);
                rating = validateIntInputByUser();
                dataBase[i][j] = rating;
            }
        }
    }

    public int validateIntInputByUser() {
        int intInput;
        while (true) {
            if (input.hasNextInt()) {
                intInput = input.nextInt();
                break;
            } else {
                System.out.println("Input has to be an integer.");
                input.next();
                continue;
            }
        }
        return intInput;
    }

    public double calculateAverageMovieRating() {
        System.out.print("Enter movie number you want to see the rating for. Movie count starts from 0: ");
        int movieNumber = input.nextInt();
        double rating = 0;
        int sum = 0;
        for (int i = 0; i < getReviewerCount(); i++) {
            sum += dataBase[movieNumber][i];
            rating = sum / (double) getReviewerCount();
        }
        return rating;
    }

    public double calculateAverageReviewerRating() {
        System.out.print("Enter reviewer number whose rating you want to see. Reviewer count starts from 0: ");
        int reviewerNumber = input.nextInt();
        double rating = 0;
        int sum = 0;
        for (int i = 0; i < getMovieCount(); i++) {
            sum += dataBase[i][reviewerNumber];
            rating = sum / (double) getMovieCount();
        }
        return rating;
    }

    public void printAverageMovieRating() {
        System.out.println(String.format("%.3f", calculateAverageMovieRating()));
    }

    public void printAverageReviewerRating() {
        System.out.println(String.format("%.3f", calculateAverageReviewerRating()));
    }

}