package com.twu.biblioteca;

public class Movie {
    private String name;
    private int year;
    private String director;
    private double rating;

    public Movie (String name, int year, String director, double rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getDirector() {
        return this.director;
    }

    public double getRating() {
        return this.rating;
    }

    public String getMovieInfo(){
        return String.format("%-15s %-15s %-15s %-15s",this.name, this.year, this.director, this.rating);
    }
}
