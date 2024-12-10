package com.example.libraryManagementSystem.LibraryManagementSystem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Admin;
import com.example.libraryManagementSystem.LibraryManagementSystem.Repositories.AdminRepo;

@Service
public class AdminServices {

    @Autowired
    AdminRepo adminRepo;


    public Admin findbyemail(String email)
    {
        
        return adminRepo.findByemail(email);
    }
    
}
