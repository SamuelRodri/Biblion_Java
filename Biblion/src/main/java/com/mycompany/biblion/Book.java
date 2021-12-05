package com.mycompany.biblion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    
    private final String title;
    private final List<Author> authors;
    private final Genre genre;
    private final String isbn;

    public Book(String title, Author[] authors, Genre genre, String isbn) {
        this.title = title;
        this.authors = Arrays.asList(authors);
        this.genre = genre;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }
}
