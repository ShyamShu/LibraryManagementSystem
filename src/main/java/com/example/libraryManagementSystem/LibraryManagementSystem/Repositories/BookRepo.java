package com.example.libraryManagementSystem.LibraryManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book , String> {

}
