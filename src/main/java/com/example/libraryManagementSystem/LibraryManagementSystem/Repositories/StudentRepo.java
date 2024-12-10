package com.example.libraryManagementSystem.LibraryManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student , String>{

    Student findByemail(String email);

}
