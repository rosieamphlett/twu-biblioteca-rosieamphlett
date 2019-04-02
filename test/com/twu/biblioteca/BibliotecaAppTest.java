package com.twu.biblioteca;

import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    private BibliotecaApp test = new BibliotecaApp();
    private BookCollection testBooks = new BookCollection();

    @Test public void testShowsWelcomeMessage() {
        String expected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        String actual = test.welcome();
        assertEquals(expected, actual);
    }

    @Test public void testShowsAllBooks() {
        ArrayList<Book> expected = testBooks.getBooks();
//        ArrayList<Book> actual = test.showAllBookInfo();
//        assertEquals(expected, actual);
    }


}
