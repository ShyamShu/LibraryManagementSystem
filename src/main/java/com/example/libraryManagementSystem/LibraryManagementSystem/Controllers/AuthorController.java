package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AuthorController {

    @GetMapping("/addAuthor")
    public String addAuthor()
    {
        return "admin/addAuthor";
    }


    @PostMapping("/addAuthor")
    public String proccessAddAuthor(@RequestParam String email , @RequestParam String name)
    {
        return "redirect:/admin/adminDashboard";
    }
    
}
