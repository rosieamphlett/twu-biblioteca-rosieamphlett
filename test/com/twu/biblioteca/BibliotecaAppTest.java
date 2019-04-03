package com.twu.biblioteca;

import org.junit.Test;

import java.awt.print.Book;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    private BibliotecaApp test = new BibliotecaApp();
    private BookCollection testBooks = new BookCollection();
    private Menu menu = new Menu();

    @Test public void testShowsWelcomeMessage() {
        String expected = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        String actual = test.welcome();
        assertEquals(expected, actual);
    }

    @Test public void testBookTitles() {
        String expected= "Harry Potter";
        String actual = testBooks.getBooks().get(0).getTitle();
        assertEquals(expected, actual);

        String expected2 = "The Bell Jar";
        String actual2 = testBooks.getBooks().get(1).getTitle();
        assertEquals(expected2, actual2);
    }

    @Test public void testBookAuthors() {
        String expected= "JK Rowling";
        String actual = testBooks.getBooks().get(0).getAuthor();
        assertEquals(expected, actual);

        String expected2 = "Sylvia Plath";
        String actual2 = testBooks.getBooks().get(1).getAuthor();
        assertEquals(expected2, actual2);
    }

    @Test public void testBookYearPublished() {
        int expected= 2001;
        int actual = testBooks.getBooks().get(0).getYear();
        assertEquals(expected, actual);

        int expected2 = 1963;
        int actual2 = testBooks.getBooks().get(1).getYear();
        assertEquals(expected2, actual2);
    }

    @Test public void testBookInfoFormatted() {
        String expected = String.format("%-15s %-15s  %-15s", "Harry Potter", "JK Rowling", 2001);
        String actual = testBooks.getBooks().get(0).getBookInfo();
        assertEquals(expected, actual);
    }

    @Test public void testMenuOptionShowsBooks() {
        String expected = "Harry Potter\rThe Bell Jar";
        String actual = menu.showAllBooks();
        assertEquals(expected, actual);
    }

    @Test public void testMenuInvalidChoice() {
        String expected = "Please select a valid option!";
        String actual = menu.invalidOption();
        assertEquals(expected, actual);
    }

    @Test public void testMenuUseCheckoutSuccess() {
        String actual = testBooks.checkout("harry potter");
        String expected = "Thank you! Enjoy the book";
        assertEquals(expected, actual);
    }

    @Test public void testMenuUseCheckoutFailed() {
        String actual = testBooks.checkout("LOTR");
        String expected = "Sorry, that book is not available";
        assertEquals(expected, actual);
    }

    @Test public void testMenuUseReturnSuccess() {
        testBooks.checkout("harry potter");
        String actual = testBooks.returnBook("harry potter");
        String expected = "Thank you for returning the book";
        assertEquals(expected, actual);
    }

    @Test public void testMenuUseReturnFailed() {
        String actual = testBooks.returnBook("LOTR");
        String expected = "That is not a valid book to return";
        assertEquals(expected, actual);
    }

    @Test public void testMenuQuit() {
        String actual = "Goodbye!";
        String expected = menu.quit();
        assertEquals(expected, actual);
    }

}
