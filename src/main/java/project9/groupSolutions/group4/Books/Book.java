package project9.groupSolutions.group4.Books;

import project9.groupSolutions.group4.Users.User;

import java.time.LocalDate;

public class Book {
    private String bookName;
    private String author;
    protected int bookID;

    private boolean isCheckedOut = false;
    private User borrower;
    private LocalDate dueDate;

    public Book(String bookName, String author, int bookID) {
        this.bookName = bookName;
        this.author = author;
        this.bookID = bookID;
    }
    public void setDueDate (int maxDate){
        this.dueDate = LocalDate.now().plusDays(maxDate);
    }
    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public int getBookID() {
        return bookID;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public User getBorrower() {
        return borrower;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }


}
