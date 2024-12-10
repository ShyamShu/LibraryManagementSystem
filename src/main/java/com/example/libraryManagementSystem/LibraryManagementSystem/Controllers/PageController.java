package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String register()
    {
        return "register";
    }

    @GetMapping("/logout")
    public String logout() {
        return "home";
    }
    


}

