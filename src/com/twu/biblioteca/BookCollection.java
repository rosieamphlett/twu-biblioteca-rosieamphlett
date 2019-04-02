package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookCollection {

    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(String title, String author, int year ) {
        Book newBook = new Book(title, author, year);
        books.add(newBook);
    }

    public ArrayList<Book> getBooks() {
        books.add(new Book("Harry Potter", "JK Rowling", 2000));
        books.add(new Book("The Bell Jar", "Sylvia Plath", 1986));
        return books;
    }

}
