package com.example.libraryManagementSystem.LibraryManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Admin;

@Repository
public interface AdminRepo  extends JpaRepository<Admin,String> {

    public Admin findByemail(String email);



    
} 
