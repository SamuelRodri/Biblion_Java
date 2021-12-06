package com.mycompany.biblion;

import java.time.LocalDate;

public abstract class Reading {
    
    private final Book book;
    protected LocalDate startDate;
    
    public Reading(Book book) {
        this.book = book;
        this.startDate = null;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
