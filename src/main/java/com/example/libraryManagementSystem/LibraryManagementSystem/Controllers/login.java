package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Admin;
import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Student;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.AdminServices;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.StudentService;

import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/login")
public class login {

    @Autowired
    StudentService studentService;
    @Autowired
    AdminServices adminServices;

    Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/admin")
    public String admin()
    {
        return "admin/loginAdmin";
    }

    @GetMapping("/student")
    public String student()
    {
        return "student/loginStudent";
    }

    @PostMapping("/do-admin")
    public String processAdminLogin(@RequestParam String email , @RequestParam String password) {
        
        logger.info("data is recahed here");
        logger.info(email);
        logger.info(password);
        
        Admin admindup = adminServices.findbyemail(email);

        if(admindup == null || !admindup.getPassword().equals(password))
        {
             return "redirect:/login/admin";
        }
        else{
            return "redirect:/admin/adminDashboard";
        }
        
    }

    @PostMapping("/do-student")
    public String processStudentLogin(@RequestParam String email , @RequestParam String password) {
       logger.info("string is reached here");
       logger.info(email);
       logger.info(password);

       Student temp = studentService.findbyemail(email);
       logger.info("studnet credential form db :{}" , temp.toString());

       if(temp == null || !temp.getPassword().equals(password) )
       {
        logger.info("problem is occured during login as student " );
        return  "redirect:/login/student";
       }
        
        return "redirect:/student/studentDashboard";
    }
    
    
    
}
