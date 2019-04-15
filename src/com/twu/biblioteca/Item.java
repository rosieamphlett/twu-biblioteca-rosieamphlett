package com.twu.biblioteca;

public class Item {
    protected String title;
    protected int year;

    public Item (String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle () {
        return this.title;
    }
    public int getYear () {
        return this.year;
    }


}
