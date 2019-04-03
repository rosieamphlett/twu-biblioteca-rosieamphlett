package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTests {
    private BookCollection testBooks = new BookCollection();

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
}
