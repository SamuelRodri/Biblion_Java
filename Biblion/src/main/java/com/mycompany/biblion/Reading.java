package com.mycompany.biblion;

public abstract class Reading {
    
    private Book book;

    public Reading(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
