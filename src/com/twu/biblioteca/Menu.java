package com.twu.biblioteca;
import java.util.Scanner;

public class Menu {
    private BookCollection books = new BookCollection();
    private MovieCollection movies = new MovieCollection();
    private String menuOption;
    private int userInput;
    private Scanner reader = new Scanner(System.in);

    public void showMenu () {
        System.out.println("MENU: \n");
        System.out.println("Enter [1] to display all available books");
        System.out.println("Enter [2] to display all available movies");
        System.out.println("Enter [3] to checkout a book");
        System.out.println("Enter [4] to checkout a movie");
        System.out.println("Enter [5] to return a book");
        System.out.println("Enter [6] to return a movie");
        System.out.println("Enter [7] to quit");
        this.userInput = Integer.parseInt(reader.nextLine());

        switch (userInput) {
            case 1: this.showAllBooks();
                    this.showMenu();
                    break;
            case 2: this.showAllMovies();
                    this.showMenu();
                    break;
            case 3: this.useCheckout();
                    this.showMenu();
                    break;
            case 4: this.checkoutMovie();
                    this.showMenu();
                    break;
            case 5: this.useReturn();
                    this.showMenu();
                    break;
            case 6: this.returnMovie();
                    this.showMenu();
                    break;
            case 7: this.quit();
                    break;
            default: this.invalidOption();
                    this.showMenu();
                    break;
        }
    }

    public String showAllBooks() {
        String r = "";
        for(Book book : books.getBooks()) {
            this.menuOption = book.getTitle();
            System.out.println(r += menuOption+"\r");
        }
        System.out.println("\r");
        return r.trim();
    }

    public String showAllMovies() {
        String r = "";
        for(Movie movie : movies.getAvailableMovies()) {
            this.menuOption = movie.getName();
            System.out.println(r += menuOption+"\r");
        }
        System.out.println("\r");
        return r.trim();
    }

    public String useCheckout() {
        System.out.println("Which book would you like to checkout?");
        String bookToCheckout = reader.nextLine();
        return books.checkout(bookToCheckout);
    }

    public String checkoutMovie() {
        System.out.println("Which movie would you like to checkout?");
        String movieToCheckout = reader.nextLine();
        return movies.checkoutMovie(movieToCheckout);
    }

    public String useReturn() {
        System.out.println("Which book would you like to return?");
        String bookToReturn = reader.nextLine();
        return books.returnBook(bookToReturn);
    }

    public String returnMovie() {
        System.out.println("Which book would you like to return?");
        String movieToReturn = reader.nextLine();
        return movies.returnMovie(movieToReturn);
    }

    public String quit() {
        this.menuOption = "Goodbye!";
        return this.menuOption;
    }

    public String invalidOption() {
        this.menuOption = "Please select a valid option!";
        System.out.println(this.menuOption);
        return this.menuOption;
    }
}
