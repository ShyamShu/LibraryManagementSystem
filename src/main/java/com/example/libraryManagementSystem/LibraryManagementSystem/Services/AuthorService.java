package com.example.libraryManagementSystem.LibraryManagementSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Author;
import com.example.libraryManagementSystem.LibraryManagementSystem.Repositories.AuthorRepo;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo authorRepo;

    public Author findAuthorbyname(String name)
    {
        return authorRepo.findByname(name);
    }

    public List<Author> getAllAuthors()
    {
        return authorRepo.findAll();
    }

    public Author findById(String Id)
    {
        return authorRepo.findById(Id).orElse(null);
    }

    

}
