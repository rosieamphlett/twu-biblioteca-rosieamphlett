package com.twu.biblioteca;
import java.util.Scanner;

public class Menu {
    private BookCollection books = new BookCollection();
    private String menuResult;

    public String showMenu () {
        Scanner reader = new Scanner(System.in);
        System.out.println("MENU: \n");
        System.out.println("Enter [1] to display all available books");
        int response = Integer.parseInt(reader.nextLine());

        if(response == 1) {
            for(Book book : books.getBooks()) {
                System.out.println(book.getTitle());
                this.menuResult = book.getTitle();
            }
        } else {
            System.out.println("Invalid entry!");
            this.menuResult = "Invalid Entry!";
            this.showMenu();
        }
        return menuResult;
    }
}
