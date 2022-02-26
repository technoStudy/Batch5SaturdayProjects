package project9.groupSolutions.group4.Users;

import project9.groupSolutions.group4.Books.Fiction;
import project9.groupSolutions.group4.Books.NonFiction;
import project9.groupSolutions.group4.Books.Reference;
import project9.groupSolutions.group4.Data;

import java.util.Scanner;

public class Librarian extends User {

    public Librarian(String firstName, String lastName, int userID) {
        super(firstName, lastName, userID, 10, 30);
    }

    public void createUser() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nNew User Registration Panel");
        System.out.println("------------------------------\n");
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        int userRole = -1;

        while (true) {
            Scanner scannerInt = new Scanner(System.in);
            System.out.print("\nChoose the role of a new user. \n" +
                    "1: Librarian\n" +
                    "2: Teacher\n" +
                    "3: Student\n" +
                    "Input: ");
            if (scannerInt.hasNextInt()) {
                userRole = scannerInt.nextInt();
                if (userRole > 0 && userRole < 4)
                    break;
            }
            System.out.println("Wrong input");
        }

        int newUserID;
        while (true) {

            System.out.print("\nPlease write an 4-digit ID that will be assigned to this user.\n" +
                    "User ID for librarians starts with 1, for teachers with 2 and for students with 3: ");
            Scanner scannerInt = new Scanner(System.in);
            if (scannerInt.hasNextInt()) {
                newUserID = scannerInt.nextInt();

                if (Data.getUserMap().containsKey(newUserID)) {
                    System.out.println("User ID is not unique");
                    continue;
                } else {
                    if ((newUserID > 999 && newUserID < 2000) && (userRole == 1)) {
                        System.out.println("You have successfully registered a new librarian!");
                        System.out.println("---------------------------------------------------\n");
                        Data.addUser(new Librarian(firstName, lastName, newUserID));
                        break;
                    } else if ((newUserID > 1999 && newUserID < 3000) && (userRole == 2)) {
                        System.out.println("You have successfully registered a new teacher!");
                        System.out.println("---------------------------------------------------\n");
                        Data.addUser(new Teacher(firstName, lastName, newUserID));
                        break;
                    } else if ((newUserID > 2999 && newUserID < 4000) && (userRole == 3)) {
                        System.out.println("You have successfully registered a new student!");
                        System.out.println("---------------------------------------------------\n");
                        Data.addUser(new Student(firstName, lastName, newUserID));
                        break;
                    } else {
                        System.out.println("Provided user ID is not valid.");
                    }
                }

            }
            System.out.println("Wrong input");
        }
    }

        public void createBook () {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nNew Book Registration Panel");
            System.out.println("------------------------------\n");
            System.out.print("Enter book name: ");
            String bookName = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            int bookType = -1;

            while (true) {
                Scanner scannerInt = new Scanner(System.in);
                System.out.print("\nChoose the type of a new book. \n" +
                        "1: Fiction\n" +
                        "2: Non-fiction\n" +
                        "3: Reference\n" +
                        "Input: ");
                if (scannerInt.hasNextInt()) {
                    bookType = scannerInt.nextInt();
                    if (bookType > 0 && bookType < 4)
                        break;
                }
                System.out.println("Wrong input");
            }

            int newBookID;
            while (true) {

                System.out.print("\nPlease write an 5-digit ID that will be assigned to this book.\n" +
                        "Book ID for fiction books starts with 1, for non-fiction with 2 and for reference books with 9: ");
                Scanner scannerInt = new Scanner(System.in);
                if (scannerInt.hasNextInt()) {
                    newBookID = scannerInt.nextInt();

                    if (Data.getBookMap().containsKey(newBookID)) {
                        System.out.println("Book ID is not unique");
                        continue;
                    } else {
                        if ((newBookID > 9999 && newBookID < 20000) && (bookType == 1)) {
                            System.out.println("You have successfully registered a new fiction book!");
                            System.out.println("---------------------------------------------------\n");
                            Data.addBook(new Fiction(bookName, author, newBookID));
                            break;
                        } else if ((newBookID > 19999 && newBookID < 30000) && (bookType == 2)) {
                            System.out.println("You have successfully registered a new non-fiction book!");
                            System.out.println("---------------------------------------------------\n");
                            Data.addBook(new NonFiction(bookName, author, newBookID));
                            break;
                        } else if ((newBookID > 89999 && newBookID < 100000) && (bookType == 3)) {
                            System.out.println("You have successfully registered a new student!");
                            System.out.println("---------------------------------------------------\n");
                            Data.addBook(new Reference(bookName, author, newBookID));
                            break;
                        } else {
                            System.out.println("Provided book ID is not valid.");
                        }
                    }

                }
                System.out.println("Wrong input");
            }

        }


        public void checkOutForUser (User user){
        int bookIDSelected;

        Scanner scanner = new Scanner(System.in);
        int userChosenByLibrarian;
        System.out.print("Please enter the ID of user you want to check out book for: ");
        if (scanner.hasNextInt()) {
            userChosenByLibrarian = scanner.nextInt();
            if(Data.getUserMap().containsKey(userChosenByLibrarian)){
                System.out.print("Please enter the book ID you want to check out for user: ");
                if (scanner.hasNextInt()) {
                    bookIDSelected = scanner.nextInt();
                    if (Data.getBookMap().containsKey(bookIDSelected)) {
                        user.checkOutBookToUser(Data.getUserMap().get(userChosenByLibrarian), Data.getBookMap().get(bookIDSelected));
                    }else {
                        System.out.println("This book ID does not exist");
                    }
                }else{
                    System.out.println("This is not valid book ID");
                }
            }else
                System.out.println("This user ID does not exist");

        }else{
            System.out.println("This is not valid user ID");
        }

    }





}
