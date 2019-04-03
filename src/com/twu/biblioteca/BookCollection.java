package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookCollection {

    private ArrayList<Book> booksAvailable = new ArrayList<Book>();
    private ArrayList<Book> checkedOutBooks = new ArrayList<Book>();
    private String resMessage;

    public BookCollection () {
        this.booksAvailable.add(new Book("Harry Potter", "JK Rowling", 2001));
        this.booksAvailable.add(new Book("The Bell Jar", "Sylvia Plath", 1963));
    }

    public ArrayList<Book> getBooks() {
        return this.booksAvailable;
    }

    public String checkout(String bookToCheckout) {
        if (booksAvailable.size() < 1) resMessage = "Sorry, that book is not available";
        for (Book book : booksAvailable) {
            if (book.getTitle().equalsIgnoreCase(bookToCheckout)) {
                resMessage = "Thank you! Enjoy the book";
                checkedOutBooks.add(book);
                booksAvailable.remove(book);
                break;
            } else {
                resMessage = "Sorry, that book is not available";
            }
        }
        System.out.println("\n"+resMessage);
        return resMessage;
    }

    public String returnBook(String bookToReturn) {
        if (checkedOutBooks.size() < 1) resMessage = "That is not a valid book to return";
        for (Book book : checkedOutBooks) {
            if(book.getTitle().equalsIgnoreCase(bookToReturn)) {
                resMessage = "Thank you for returning the book";
                checkedOutBooks.remove(book);
                booksAvailable.add(book);
                break;
            }
            resMessage = "That is not a valid book to return";
        }
        System.out.println("\n"+resMessage);
        return resMessage;
    }

}
