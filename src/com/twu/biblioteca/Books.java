package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Books {

    private List<String> books = new ArrayList<String>();


    public List<String> getBooks() {
        String[] list = {"The Communist Manifesto", "The Bell Jar",
                "Harry Potter and the Philosopher's stone", "The Power",
                "The hitchhikers guide to the galaxy"};
        Collections.addAll(books, list);
        return books;
    }
}
