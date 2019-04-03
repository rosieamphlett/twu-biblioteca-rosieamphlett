package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> availableMovies = new ArrayList<Movie>();

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

}
