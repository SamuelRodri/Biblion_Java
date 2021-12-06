package com.mycompany.biblion;

import java.util.ArrayList;

public class Biblion {

    private final ArrayList<Book> books;
    private final ArrayList<ProposedReading> proposedReadings;
    private final ArrayList<StartedReading> startedReadings;
    private final ArrayList<FinishedReading> finishedReadings;

    public Biblion() {
        this.books = new ArrayList<>();
        this.proposedReadings = new ArrayList<>();
        this.startedReadings = new ArrayList<>();
        this.finishedReadings = new ArrayList<>();
    }
    
    private void createReading(Book book){
        this.proposedReadings.add(new ProposedReading(book));
    }
    
    private void startReading(Reading reading){
       int index = this.proposedReadings.indexOf(reading);
       
       if(index != -1){
           
           
       }
    }  
    
    private void endReading(Reading reading){
        this.startedReadings
    }
}
