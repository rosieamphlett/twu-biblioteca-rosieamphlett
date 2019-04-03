package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    private BibliotecaApp test = new BibliotecaApp();

    @Test public void testShowsWelcomeMessage() {
        String expected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        String actual = test.welcome();
        assertEquals(expected, actual);
    }
}
