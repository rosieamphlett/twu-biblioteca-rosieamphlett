package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    private Menu menu = new Menu();

    @Test
    public void testMenuOptionShowsBooks() {
        String expected = "Harry Potter\rThe Bell Jar";
        String actual = menu.showAllBooks();
        assertEquals(expected, actual);
    }

    @Test public void testMenuInvalidChoice() {
        String expected = "Please select a valid option!";
        String actual = menu.invalidOption();
        assertEquals(expected, actual);
    }

    @Test public void testMenuQuit() {
        String actual = "Goodbye!";
        String expected = menu.quit();
        assertEquals(expected, actual);
    }
}
