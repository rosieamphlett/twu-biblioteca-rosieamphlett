package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> availableMovies = new ArrayList<Movie>();
    private ArrayList<Movie> checkedOutMovies = new ArrayList<Movie>();
    private String resMessage;

    public MovieCollection() {
        Movie movie1 = new Movie("Hidden Figures", 2016, "Theodore Melfi", 7.8);
        Movie movie2 = new Movie("Legally Blonde", 2001, "Robert Luketic", 6.3);
        Movie movie3 = new Movie("Oceans 8", 2018, "Gary Ross", 6.2);
        Movie movie4 = new Movie("Captain Marvel", 2019, "Anna Boden", 7.2);

        availableMovies.add(movie1);
        availableMovies.add(movie2);
        availableMovies.add(movie3);
        availableMovies.add(movie4);
    }

    public ArrayList<Movie> getAvailableMovies() {
        return this.availableMovies;
    }

    public String checkoutMovie(String movieToCheckout) {
        if (availableMovies.size() < 1) resMessage = "Sorry, that movie is not available";
        for (Movie movie : availableMovies) {
            if (movie.getName().equalsIgnoreCase(movieToCheckout)) {
                resMessage = "Thank you! Enjoy the movie";
                checkedOutMovies.add(movie);
                availableMovies.remove(movie);
                break;
            } else {
                resMessage = "Sorry, that movie is not available";
            }
        }
        System.out.println("\n"+resMessage);
        return resMessage;
    }

    public String returnMovie(String movieToReturn) {
        if (checkedOutMovies.size() < 1) resMessage = "That is not a valid movie to return";
        for (Movie movie : checkedOutMovies) {
            if(movie.getName().equalsIgnoreCase(movieToReturn)) {
                resMessage = "Thank you for returning the movie";
                checkedOutMovies.remove(movie);
                availableMovies.add(movie);
                break;
            }
            resMessage = "That is not a valid movie to return";
        }
        System.out.println("\n"+resMessage);
        return resMessage;
    }
}
