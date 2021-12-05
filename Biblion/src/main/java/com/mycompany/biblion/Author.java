package com.mycompany.biblion;

import java.util.ArrayList;

public class Author {

    private String name;
    
    private ArrayList<Book> books = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }    
}
