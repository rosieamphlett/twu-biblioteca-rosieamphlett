package com.twu.biblioteca;

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
