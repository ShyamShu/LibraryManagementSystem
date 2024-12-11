package com.example.libraryManagementSystem.LibraryManagementSystem.Services;

import java.util.List;
import java.util.UUID;

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

    public Author saveAuthor(Author author) throws Exception
    {
        String uuid = UUID.randomUUID().toString();
        author.setAuthorId(uuid);

        try{
            authorRepo.save(author);
        }
        catch(Exception e)
        {
            throw new Exception("Error occured in saving author");
        }

        return author;
    }

    

}
