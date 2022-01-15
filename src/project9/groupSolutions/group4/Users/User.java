package project9.groupSolutions.group4.Users;

import project9.groupSolutions.group4.Books.Book;
import project9.groupSolutions.group4.Data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class User {

    String firstName;
    String lastName;
    int userID;
    private Map<Integer, Book> bookList = new HashMap<>();
    private final int BOOK_LIMIT;
    private final int MAX_DAYS;

    public User(String firstName, String lastName, int userID, int bookLimit, int maxDays) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
        this.BOOK_LIMIT = bookLimit;
        this.MAX_DAYS = maxDays;
    }
    private void removeFromBookList (Book book){
        this.bookList.remove(book.getBookID());
    }
    private void addToBookList (Book book){
        this.bookList.put(book.getBookID(), book);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getUserID() {
        return userID;
    }

    public Map<Integer, Book> getBookList() {
        return bookList;
    }

    public void selfCheckOut(int bookID) {
        if (Data.getBookMap().containsKey(bookID)) {
            if (getBookList().size() < BOOK_LIMIT) {
                Book book = Data.getBookMap().get(bookID);
                if(!(bookID > 89999 && bookID < 100000)){
                    if (!book.isCheckedOut()) {
                        book.setBorrower(this);
                        book.setCheckedOut(true);
                        addToBookList(book);
                        LocalDate localDate = LocalDate.now();
                        book.setDueDate(MAX_DAYS);

                        System.out.println("It has successfully been checked out.");
                        System.out.println("User: " + firstName + " " + lastName +
                                "\nBook ID: " + book.getBookID() +
                                "\nBook name: " + book.getBookName() +
                                "\nBook author: " + book.getAuthor() +
                                "\nCheck out date: " + localDate +
                                "\nDue date: " + book.getDueDate());
                        System.out.println("Number of books checked out so far: " + getBookList().size());
                    }else {
                        System.out.println("This book is already checked out.");
                    }
                }else{
                    System.out.println("This is a reference book, and it cannot be checked out.");
                }
            }else {
                System.out.println("You have exceeded your book limit, you can not check out more books");
            }
        }else {
            System.out.println("This book ID does not exist");
        }
    }

    public void checkIn(int bookID){
        if (Data.getBookMap().containsKey(bookID)) {
            Book book = Data.getBookMap().get(bookID);

            if (book.isCheckedOut()) {
                book.getBorrower().removeFromBookList(book);
                book.setBorrower(null);
                book.setCheckedOut(false);
                LocalDate localDate = LocalDate.now();
                if(localDate.isAfter(book.getDueDate())){
                    System.out.println("Thanks for returning. The due date was " + book.getDueDate() + "Please do your best to return the books on time next time!");
                }else{
                    System.out.println("Thanks for returning it on time. Have a great day.");
                }
            }else {
                System.out.println("This book is not checked out.");
            }
        }else {
            System.out.println("This book ID does not exist");
        }
    }

    public void checkOutBookToUser (User user, Book book){
        user.selfCheckOut(book.getBookID());
    }

}
