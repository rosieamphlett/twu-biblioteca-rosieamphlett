package com.twu.biblioteca;

public class ShowAll {
    private String menuOption;

    public String showAllBooks(BookCollection books) {
        String r = "";
        for(Book book : books.getBooks()) {
            this.menuOption = book.getTitle();
            System.out.println(r += menuOption+"\r");
        }
        System.out.println("\r");
        return r.trim();
    }

    public String showAllMovies(MovieCollection movies) {
        String r = "";
        for(Movie movie : movies.getAvailableMovies()) {
            this.menuOption = movie.getTitle();
            System.out.println(r += menuOption+"\r");
        }
        System.out.println("\r");
        return r.trim();
    }
}
