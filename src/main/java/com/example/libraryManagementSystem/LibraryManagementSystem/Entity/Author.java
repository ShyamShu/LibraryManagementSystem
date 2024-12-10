package com.example.libraryManagementSystem.LibraryManagementSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "author")
public class Author {

    @Id
    public String authorId;

    public String name;
    public String authorEmail;
    

    // mapping of all books written by author


    
}
