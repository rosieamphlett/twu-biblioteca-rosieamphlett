package com.twu.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class Checkout {
//    private BookCollection books = new BookCollection();
    private MovieCollection movies = new MovieCollection();
    private Scanner reader = new Scanner(System.in);

    public String checkoutBook(BookCollection books) {
        System.out.println("Which book would you like to checkout?");
        String bookToCheckout = reader.nextLine();
        return books.checkout(bookToCheckout);
    }

    public String checkoutMovie() {
        System.out.println("Which movie would you like to checkout?");
        String movieToCheckout = reader.nextLine();
        return movies.checkoutMovie(movieToCheckout);
    }
}
