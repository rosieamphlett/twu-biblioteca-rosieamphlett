package com.twu.biblioteca;

public class Movie extends Item {
    private String director;
    private double rating;

    public Movie (String title, int year, String director, double rating) {
        super(title, year);
        this.director = director;
        this.rating = rating;
    }

    public String getDirector() {
        return this.director;
    }

    public double getRating() {
        return this.rating;
    }

    public String getMovieInfo(){
        return String.format("%-15s %-15s %-15s %-15s",this.title, this.year, this.director, this.rating);
    }
}
