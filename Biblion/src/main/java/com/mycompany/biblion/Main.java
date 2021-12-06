package com.mycompany.biblion;

public class Main {
    
    public static void main(String[] args){
    
        Author cervantes = new Author("Cervantes");
        Book elQuijote = new Book("El Quijote", new Author[]{cervantes}, Genre.Narration, "1234");
        StartedReading sr = new StartedReading(elQuijote);
        
    }
}
