package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static ArrayList<Book> Books;

    public static void main(String[] args) {
	Books = new ArrayList<>();
        //Same old menu method -- why recreate the wheel?
        showMenu();
    }
    public static void showMenu() {
        Scanner userInput = new Scanner(System.in);
        int appState = 0;
        while(appState == 0) {
            System.out.println("...................................");
            System.out.println("Please make a selection:  ");
            System.out.println("1 - Add new order");
            System.out.println("2 - View orders");
            System.out.println("3 - Search orders");
            System.out.println("4 - Exit application");

            appState = userInput.nextInt();
            appState = execMenuItem(appState);
        }
    }
    public static int execMenuItem(int state){
    //Same old menu method -- why recreate the wheel?

            if(state == 1) {
                createBook();
            }else if(state == 2) {
                showBooks();
            }else if(state == 3) {
                searchBooks();
            }else if (state == 4) {
                exitApp(0);
            }else {

            }

            state = 0;
            return state;

    }
    public static void createBook() {

        System.out.print("Please enter a book title: ");

    }
    public static void showBooks() {

    }
    public static void searchBooks() {

    }
    public static void exitApp(int code){
        System.exit(code);
    }
}
