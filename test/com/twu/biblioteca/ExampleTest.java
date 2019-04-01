package com.twu.biblioteca;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    private BibliotecaApp test = new BibliotecaApp();
    private Books testBooks = new Books();

    @Test public void testShowsWelcomeMessage() {
        String expected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        String actual = test.welcome();
        assertEquals(expected, actual);
    }

    @Test public void testShowsAllBooks() {
        List<String> expected = testBooks.getBooks();
        List<String> actual = test.showAllBooks();
        assertEquals(expected, actual);
    }
}
