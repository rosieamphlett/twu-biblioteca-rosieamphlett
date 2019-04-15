package com.twu.biblioteca;

import java.util.Scanner;
import java.util.ArrayList;

public class CheckoutReturn {
//    private BookCollection books = new BookCollection();
    private MovieCollection movies = new MovieCollection();
    private Scanner reader = new Scanner(System.in);

    public String checkoutBook(BookCollection books) {
        System.out.println("Which book would you like to checkout?");
        String bookToCheckout = reader.nextLine();
        return books.checkout(bookToCheckout);
    }

    public String checkoutMovie(MovieCollection movies) {
        System.out.println("Which movie would you like to checkout?");
        String movieToCheckout = reader.nextLine();
        return movies.checkoutMovie(movieToCheckout);
    }

    public String returnBook(BookCollection books) {
        System.out.println("Which book would you like to return?");
        String bookToReturn = reader.nextLine();
        return books.returnBook(bookToReturn);
    }

    public String returnMovie(MovieCollection movies) {
        System.out.println("Which book would you like to return?");
        String movieToReturn = reader.nextLine();
        return movies.returnMovie(movieToReturn);
    }
}
