package com.assignment15.library.transactions;

import com.assignment15.library.books.Book;
import com.assignment15.library.members.Member;

import java.time.LocalDate;

public class Transaction {
    private Book book;
    private Member member;
    private String issueDate; // Use String to represent the date
    private String returnDate; // Use String to represent the date

    public Transaction(Book book, Member member, String issueDate) {
        this.book = book;
        this.member = member;
        this.issueDate = issueDate;
    }

    public void returnBook(String returnDate) {
        this.returnDate = returnDate;
        this.book.setAvailable(true);
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String toString() {
        return "Transaction [Book=" + book.getTitle() + ", Member=" + member.getName() + ", Issue Date=" + issueDate
                + ", Return Date=" + (returnDate != null ? returnDate : "Not Returned") + "]";
    }

}
