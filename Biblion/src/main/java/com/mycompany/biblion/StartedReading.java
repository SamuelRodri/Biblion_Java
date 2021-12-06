package com.mycompany.biblion;

import java.time.LocalDate;

public class StartedReading extends Reading {
    
    public StartedReading(Book book) {
        super(book);
        this.startDate = LocalDate.now();
    }   
}
