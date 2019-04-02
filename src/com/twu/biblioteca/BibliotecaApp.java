package com.twu.biblioteca;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    private Menu menu = new Menu();

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.welcome();
//        bibliotecaApp.showAllBookInfo();
    }

    public String welcome() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(welcomeMessage + "\n");
        menu.showMenu();
        return welcomeMessage;
    }

//    public List showAllBookInfo() {
//        BookCollection library = new BookCollection();
//        for (Book book : library.getBooks()) {
//            System.out.println(book.getBookInfo());
//
//        }
//        return library.getBooks();
//    }
}
