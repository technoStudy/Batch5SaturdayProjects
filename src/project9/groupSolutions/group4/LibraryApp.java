package project9.groupSolutions.group4;

import project9.groupSolutions.group4.Users.Librarian;
import project9.groupSolutions.group4.Users.User;

import java.util.Scanner;


public class LibraryApp {
    public static void main(String[] args) {

        title();
        intro();

    }
    private static void title (){
        System.out.println("+------------------------------------------+");
        System.out.println("| WELCOME TO TECHNO STUDY LIBRARY SOFTWARE |");
        System.out.println("+------------------------------------------+");
    }

    private static void intro (){
        int userIDchoice;

        System.out.print("\nPlease enter your user ID: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            userIDchoice = scanner.nextInt();
            if (userIDchoice < 1000 || userIDchoice > 3999){
                System.out.println("This is not a valid user ID (it should be from 1000 to 3999).");
            }else if (Data.getUserMap().containsKey(userIDchoice)) {
                User user = Data.getUserMap().get(userIDchoice);
                System.out.print("Welcome " + user.getFirstName() + " " + user.getLastName() + "!\n");
                userMenu(userIDchoice);
            }else {
                System.out.println("This user is not registered");
            }
        }else {
            System.out.println("This is not a valid user ID.");
        }
        intro();
    }

    private static void userMenu (int choice){
        int selection;
        int bookIDSelected;
        boolean isLibrarian = false;
        User user = Data.getUserMap().get(choice);


        if (choice > 999 && choice < 4000) {
            System.out.print("\nWhat do you want to do\n" +
                    "0: Exit from the program\n" +
                    "1: Check out (borrow) a book for yourself\n" +
                    "2: Check in (return) a book\n");
        }
        if (choice > 999 && choice < 2000) {
            isLibrarian = true;
            System.out.print("3: Register a user\n" +
                    "4: Register a book\n" +
                    "5: Check out (assign) a book to a user\n");
        }
        System.out.print("Enter the number of your selection: ");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            selection = scanner.nextInt();
            if (selection == 0){
                System.out.println("Thank you! See you next time.\n");
                title();
            } else if (selection == 1){
                System.out.print("Please enter the book ID you want to check out: ");
                if (scanner.hasNextInt()) {
                    bookIDSelected = scanner.nextInt();
                    user.selfCheckOut(bookIDSelected);
                    //intro();
                }else{
                    System.out.println("This is not valid book ID");
                }
            } else if (selection == 2){
                System.out.print("Please enter the book ID you want to check in: ");
                if (scanner.hasNextInt()) {
                    bookIDSelected = scanner.nextInt();
                    user.checkIn(bookIDSelected);
                }else{
                    System.out.println("This is not valid book ID");
                }
            } else if (isLibrarian && selection < 6) {
                    Librarian librarian = (Librarian) user;
                if (selection == 3){
                    librarian.createUser();
                }else if(selection == 4) {
                    librarian.createBook();
                }else {
                    librarian.checkOutForUser(user);
                }
            }else{
                System.out.println("This is not a valid selection.");
            }
        } else {
            System.out.println("This is not a valid input.");
        }

    }
}
