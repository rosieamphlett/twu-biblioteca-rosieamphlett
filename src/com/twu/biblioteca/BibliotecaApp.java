package com.twu.biblioteca;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        Menu menu = new Menu();

        bibliotecaApp.welcome();
        menu.showMenu();
    }

    public String welcome() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        System.out.println(welcomeMessage + "\n");
        return welcomeMessage;
    }
}
