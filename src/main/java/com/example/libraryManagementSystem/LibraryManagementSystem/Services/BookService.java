package com.example.libraryManagementSystem.LibraryManagementSystem.Services;

import java.util.List;
import java.util.UUID;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Book;
import com.example.libraryManagementSystem.LibraryManagementSystem.Repositories.BookRepo;

@Service
public class BookService {
    @Autowired
    BookRepo bookRepo;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public Book saveBook(Book book) throws Exception
    {
         String uuid = UUID.randomUUID().toString();
         book.setBookId(uuid);
        try{
            bookRepo.save(book);
        }
        catch(Exception e)
        {
           logger.info(e.toString());
            throw new Exception("something error happens in saving book details");
        }
        return book;
    }

    public Book findBTitle(String title)
    {
        return bookRepo.findBytittle(title);
    }

    public Book findById(String Id)
    {
        return bookRepo.findById(Id).orElse(null);
    }

    public List<Book> findAll()
    {
        return bookRepo.findAll();
    }

}
