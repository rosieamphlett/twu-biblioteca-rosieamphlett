package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle () {
        return this.title;
    }

    public String getAuthor () {
        return this.author;
    }

    public int getYear () {
        return this.year;
    }

    public String getBookInfo(){
        return String.format("%-15s %-15s  %-15s",this.title, this.author, this.year);
    }
}
