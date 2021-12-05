package com.mycompany.biblion;

import java.util.Date;

public class FinishedReading extends Reading{

    private Date startDate;
    private Date endDate;
    private int calification;
    
    public FinishedReading(Book book) {
        super(book);
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }    
}
