package project9.solution.Users;

import project9.solution.Books.Book;
import project9.solution.Books.Fiction;
import project9.solution.Books.NonFiction;
import project9.solution.Books.Reference;
import project9.solution.Data;

import java.util.Scanner;

public class Librarian extends User {
    public Librarian(String name, String lastName, int userId) {
        super(name, lastName, userId, 10, 30);

    }

    public void createUser() {

        boolean loop = true;
        int selection;
        do {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("\nWhat user do you want to register?" +
                    "\n1: Librarian" +
                    "\n2: Teacher" +
                    "\n3: Student" +
                    "\n\nEnter the number of your selection: ");
            selection = keyboard.nextInt();
            if (selection == 1 || selection == 2 || selection == 3) {
                loop = false;
            } else {
                System.out.println("You have entered an invalid user type." +
                        "Please try again.");
            }
        }while(loop);

        createRole(selection);
    }

    private void createRole(int r) {
        String roleName = "";
        switch (r) {
            case 1:
                roleName = "librarian";
                break;
            case 2:
                roleName = "teacher";
                break;
            case 3:
                roleName = "student";
                break;
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the name of the " + roleName + ": ");
        String name = keyboard.nextLine();

        System.out.print("Enter the last name of the " + roleName + ": ");
        String lastName = keyboard.nextLine();

        int userId = 0;
        boolean loop = true;
        do {
            System.out.print("Enter a four-digit user ID starting with " + r + ": ");
            int Id = keyboard.nextInt();
            if (Id < r * 1000 || Id >= (r + 1) * 1000) {
                System.out.println("User ID must be a four digit number starting with " + r + ".");
            } else if (Data.getUserMap().containsKey(Id)) {
                System.out.println("This user ID is already taken. Please use another user ID.");
            } else {
                userId = Id;
                loop = false;
            }
        } while (loop);

        switch (r) {
            case 1:
                Data.addUser(new Librarian(name, lastName, userId));
                break;
            case 2:
                Data.addUser(new Teacher(name, lastName, userId));
                break;
            case 3:
                Data.addUser(new Student(name, lastName, userId));
                break;
        }

        System.out.println("The " + roleName + " successfully registered.");

    }

    public void checkOut(int userId, int bookId) {
        if (Data.getBookMap().containsKey(bookId)) {
            Book bookToBeCheckOut = Data.getBookMap().get(bookId);
            if (Data.getUserMap().containsKey(userId)) {
                User borrower = Data.getUserMap().get(userId);
                checkOutBookToUser(borrower, bookToBeCheckOut);
            } else {
                System.out.println("This is not a valid user ID.");
            }
        } else {
            System.out.println("This is not a valid book ID.");
        }
    }

    public void createBook() {
        boolean loop = true;
        int selection;
        do{
            Scanner keyboard = new Scanner(System.in);
            System.out.print("\nWhat book do you want to register?" +
                    "\n1: Fiction" +
                    "\n2: Non-Fiction" +
                    "\n9: Reference" +
                    "\nEnter the number of your selection: ");
            selection = keyboard.nextInt();
            if (selection == 1 || selection == 2 || selection == 9) {
                loop = false;
            } else {
                System.out.println("You have entered an invalid book type." +
                        "Please try again.");
            }
        }while(loop);

        createBookType(selection);
    }

    private void createBookType(int t) {
        String type = "";
        switch (t) {
            case 1:
                type = "Fiction";
                break;
            case 2:
                type = "Non-fiction";
                break;
            case 9:
                type = "Reference";
                break;
        }

        Scanner keyboard = new Scanner(System.in);
        boolean loop = true;
        System.out.print("\n" + type + " book id must be a five-digit number starting with " + t + ".");
        do {
            System.out.print("\nPlease enter a " + type + " book Id: ");
            int id = keyboard.nextInt();
            if (Data.getBookMap().containsKey(id)) {
                System.out.println("This book ID is already taken. Please try another one.");
            } else if (id < t * 10000 || id >= (t + 1) * 10_000) {
                System.out.print(type + " book ID must be a five-digit number starting with " + t + ".");
            } else {
                keyboard.nextLine();
                System.out.print("Enter book title: ");
                String title = keyboard.nextLine();
                System.out.print("Enter the author: ");
                String author = keyboard.nextLine();

                switch (t) {
                    case 1:
                        Data.addBook(new Fiction(title, author, id));
                        break;
                    case 2:
                        Data.addBook(new NonFiction(title, author, id));
                        break;
                    case 9:
                        Data.addBook(new Reference(title, author, id));
                        break;
                }

                System.out.println("The " + type + " book was successfully registered.");
                loop = false;
            }
        } while (loop);

    }
}
