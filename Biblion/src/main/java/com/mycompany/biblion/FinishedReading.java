package com.mycompany.biblion;

import java.time.LocalDate;

public class FinishedReading extends Reading{

    private LocalDate endDate;
    private int calification;
    
    public FinishedReading(Book book) {
        super(book);
        this.endDate = LocalDate.now();
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }    
}
