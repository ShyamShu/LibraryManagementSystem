package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Author;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.AuthorService;

@Controller
@RequestMapping("/admin")
public class AuthorController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AuthorService authorService;

    @GetMapping("/addAuthor")
    public String addAuthor()
    {
        return "admin/addAuthor";
    }


    @PostMapping("/addAuthor")
    public String proccessAddAuthor(@RequestParam String email , @RequestParam String name) throws Exception
    {
        logger.info("adding author process is initiated ");
        logger.info(name);
        logger.info(email);

        Author author = new Author();
        author.setAuthorEmail(email);
        author.setName(name);

        logger.info(authorService.saveAuthor(author).toString());

        return "redirect:/admin/adminDashboard";
    }
    
}
