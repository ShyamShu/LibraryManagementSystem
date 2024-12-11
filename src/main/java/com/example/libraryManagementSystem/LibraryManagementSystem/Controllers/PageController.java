package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Student;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.StudentService;



@Controller
public class PageController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentService studentService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String register()
    {
        return "register";
    }

    @PostMapping("/do-register")
    public String ProcessRegisterUser(@RequestBody String email , @RequestParam String password , @RequestParam String name ) throws Exception {
        
           logger.info("User registrattion Process is initiated ");
           logger.info(name);
           logger.info(email);
           logger.info(password);
           
           Student student = new Student();
           student.setName(name);
           student.setEmail(email);
           student.setPassword(password);


           logger.info(studentService.saveStudent(student).toString());

        
        return "redirect:/home";
    }
    

    @GetMapping("/logout")
    public String logout() {
        return "home";
    }
    


}

