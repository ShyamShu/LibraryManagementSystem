package com.example.libraryManagementSystem.LibraryManagementSystem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Student;
import com.example.libraryManagementSystem.LibraryManagementSystem.Repositories.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student findbyemail(String email) {
       
        return studentRepo.findByemail(email);
    }

}
