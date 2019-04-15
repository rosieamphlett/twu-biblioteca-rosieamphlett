package com.twu.biblioteca;

public class Book extends Item {
    private String author;

    public Book(String title, String author, int year) {
        super(title, year);
        this.author = author;
    }

    public String getAuthor () {
        return this.author;
    }

    public String getBookInfo(){
        return String.format("%-15s %-15s %-15s", this.title, this.author, this.year);
    }
}
