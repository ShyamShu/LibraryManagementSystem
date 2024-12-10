package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Student;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.StudentService;

@Controller
@RequestMapping("/admin")
public class updatingStudentController {

    @Autowired
    StudentService studentService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/addStudent")
    public String addStudent()
    {
       return "admin/addStudent";
    }

    @PostMapping("/addStudent")
    public String processAddStudent(@RequestParam String name , @RequestParam String email , @RequestParam String password ) throws Exception
    {
        logger.info(name);
        logger.info(password);
        logger.info(email);

        Student student = new Student();
        student.setEmail(email);
        student.setName(name);
        student.setPassword(password);

        logger.info(studentService.saveStudent(student).toString());
        
       return "redirect:/admin/adminDashboard";
    }


    @GetMapping("/updateStudent")
    public String updateStudent() {
        return "admin/updateStudent";
    }
    
    
}
