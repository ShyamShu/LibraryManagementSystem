package com.example.libraryManagementSystem.LibraryManagementSystem.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction , String> {

    List<Transaction> findByStudentEmail(String email);

}
