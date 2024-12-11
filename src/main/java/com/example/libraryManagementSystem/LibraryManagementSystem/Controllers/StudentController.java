package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/student")
public class StudentController {


    @GetMapping("/futureProcess")
    public String getMethodName() {
        return "admin/futurepage";
    }
    





    

}
