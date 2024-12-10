package com.example.libraryManagementSystem.LibraryManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author , String> {

    Author findByname(String name);



}
