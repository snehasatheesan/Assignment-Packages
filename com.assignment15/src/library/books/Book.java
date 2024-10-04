   //1. Design a library management system using packages.
// Create packages such as library.books , library.members , and library.transactions .
    // Implement classes within these packages to represent books, members, and transactions.
    // Demonstrate the usage of packages to organize the code logically.
package com.assignment15.library.books;

public  class Book {
 
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", Available=" + isAvailable + "]";
    }
}
