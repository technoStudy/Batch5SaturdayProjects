package project9.solution;

import project9.solution.Users.Librarian;
import project9.solution.Users.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryApp {

    private static User activeUser;

    public static User getActiveUser() {
        return activeUser;
    }

    public static void main(String[] args) {
        System.out.println("" +
                "+------------------------------------------------+\n" +
                "|    WELCOME TO TECHNO STUDY LIBRARY SOFTWARE    |\n" +
                "+------------------------------------------------+\n");

        if (setActiveUser()) {
            boolean loop = true;
            do {
                int function = selectFunctionality(activeUser);
                switch (function) {
                    case 0:
                        System.out.println("\nSee you next time. Good Bye!");
                        loop = false;
                        break;
                    case 1:
                        System.out.print("Please enter the book Id you want to CHECK OUT: ");
                        activeUser.selfCheckOut(new Scanner(System.in).nextInt());
                        break;
                    case 2:
                        System.out.print("Please enter the book Id you want to CHECK IN: ");
                        activeUser.checkIn(new Scanner(System.in).nextInt());
                        break;
                    case 3:
                        if (activeUser instanceof Librarian) {
                            ((Librarian) activeUser).createUser();
                            break;
                        }
                    case 4:
                        if (activeUser instanceof Librarian) {
                            ((Librarian) activeUser).createBook();
                            break;
                        }
                    case 5:
                        if (activeUser instanceof Librarian) {
                            System.out.print("Please enter the book Id you want to CHECK OUT: ");
                            int bookId = new Scanner(System.in).nextInt();
                            System.out.print("\nPlease enter the USER ID you want to check this book out: ");
                            int userId = new Scanner(System.in).nextInt();
                            ((Librarian) activeUser).checkOut(userId, bookId);
                            break;
                        }
                    default:

                        System.out.println("You have entered an invalid action number.");
                }
            } while (loop);
        }

    }  // end of main method

    private static boolean setActiveUser() {
        boolean loop = true;
        boolean setUser = false;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Please enter your User ID: ");
            int userId = 0;
            try {
                userId = keyboard.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a four digit number.");
            }

            if (Data.getUserMap().containsKey(userId)) {
                activeUser = Data.getUserMap().get(userId);
                String userName = activeUser.getName();
                String userLastName = activeUser.getLastName();
                System.out.println("Welcome " + userName + " " + userLastName + "!");
                loop = false;
                setUser = true;
            } else {
                System.out.println("You have entered an invalid ID.");
                System.out.print("Press any key to try again or press C to Cancel: ");
                keyboard.nextLine();
                if (keyboard.nextLine().equalsIgnoreCase("C")) {
                    loop = false;
                    System.out.println("\nGood Bye!");
                }
            }
        } while (loop);
        return setUser;
    }// end of setActiveUser method

    private static int selectFunctionality(User user) {
        System.out.println(
                "\nWhat do you want to do?" +
                        "\n0: Exit from the program" +
                        "\n1: Check out (borrow) a book for yourself" +
                        "\n2: Check in (return) a book"
        );
        if (user instanceof Librarian) {
            System.out.println(
                    "3: Register a user" +
                            "\n4: Register a book" +
                            "\n5: Check out (assign) a book to a user"
            );
        }
        System.out.print("Enter the number of your selection: ");

        return new Scanner(System.in).nextInt();
    }// end of selectFunctionality method

} // end of class
