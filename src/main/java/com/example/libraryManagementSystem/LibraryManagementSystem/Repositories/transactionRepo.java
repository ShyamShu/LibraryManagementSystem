package com.example.libraryManagementSystem.LibraryManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Transaction;

@Repository
public interface transactionRepo extends JpaRepository<Transaction , String> {

}
