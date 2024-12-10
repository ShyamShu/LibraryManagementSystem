package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {


    @GetMapping("/admin/adminDashboard")
    public String AdminDashboard()
    {
        return "admin/adminDashboard";
    }

    @GetMapping("/student/studentDashboard")
    public String StudentDashboard()
    {
        return "student/studentDashboard";
    }



}
