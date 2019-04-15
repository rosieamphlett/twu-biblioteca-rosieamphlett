package com.twu.biblioteca;
import java.util.Scanner;

public class Menu {
    private BookCollection books = new BookCollection();
    private MovieCollection movies = new MovieCollection();
    private CheckoutReturn checkoutreturn = new CheckoutReturn();
    private ShowAll getAll = new ShowAll();
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
            case 1: getAll.showAllBooks(books);
                    this.showMenu();
                    break;
            case 2: getAll.showAllMovies(movies);
                    this.showMenu();
                    break;
            case 3: checkoutreturn.checkoutBook(books);
                    this.showMenu();
                    break;
            case 4: checkoutreturn.checkoutMovie(movies);
                    this.showMenu();
                    break;
            case 5: checkoutreturn.returnBook(books);
                    this.showMenu();
                    break;
            case 6: checkoutreturn.returnMovie(movies);
                    this.showMenu();
                    break;
            case 7: this.quit();
                    break;
            default: this.invalidOption();
                    this.showMenu();
                    break;
        }
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
