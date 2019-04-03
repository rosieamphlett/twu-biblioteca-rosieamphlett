package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTests {
    private MovieCollection testMovies = new MovieCollection();

    @Test public void testMovieTitles() {
        String expected= "Hidden Figures";
        String actual = testMovies.getAvailableMovies().get(0).getName();
        assertEquals(expected, actual);

        String expected2 = "Legally Blonde";
        String actual2 = testMovies.getAvailableMovies().get(1).getName();
        assertEquals(expected2, actual2);
    }

    @Test public void testMovieDirectors() {
        String expected= "Theodore Melfi";
        String actual = testMovies.getAvailableMovies().get(0).getDirector();
        assertEquals(expected, actual);

        String expected2 = "Robert Luketic";
        String actual2 = testMovies.getAvailableMovies().get(1).getDirector();
        assertEquals(expected2, actual2);
    }

    @Test public void testYearMovieReleased() {
        int expected= 2018;
        int actual = testMovies.getAvailableMovies().get(2).getYear();
        assertEquals(expected, actual);

        int expected2 = 2019;
        int actual2 = testMovies.getAvailableMovies().get(3).getYear();
        assertEquals(expected2, actual2);
    }

    @Test public void testMovieRating() {
        double expected = 6.2;
        double actual = testMovies.getAvailableMovies().get(2).getRating();
        Assert.assertEquals(expected, actual, 0);

        double expected2 = 7.2;
        double actual2 = testMovies.getAvailableMovies().get(3).getRating();
        Assert.assertEquals(expected, actual, 0);
    }

    @Test public void testMovieInfoFormatted() {
        String expected = String.format("%-15s %-15s %-15s %-15s", "Hidden Figures", 2016, "Theodore Melfi", 7.8);
        String actual = testMovies.getAvailableMovies().get(0).getMovieInfo();
        assertEquals(expected, actual);
    }

    @Test public void testMovieCheckoutSuccess() {
        String actual = testMovies.checkoutMovie("legally blonde");
        String expected = "Thank you! Enjoy the movie";
        assertEquals(expected, actual);
    }

    @Test public void testMovieCheckoutFailed() {
        String actual = testMovies.checkoutMovie("LOTR");
        String expected = "Sorry, that movie is not available";
        assertEquals(expected, actual);
    }

    @Test public void testMovieReturnSuccess() {
        testMovies.checkoutMovie("captain marvel");
        String actual = testMovies.returnMovie("Captain Marvel");
        String expected = "Thank you for returning the movie";
        assertEquals(expected, actual);
    }

    @Test public void testMovieReturnFailed() {
        testMovies.checkoutMovie("captain marvel");
        String actual = testMovies.returnMovie("LOTR");
        String expected = "That is not a valid movie to return";
        assertEquals(expected, actual);
    }

}
