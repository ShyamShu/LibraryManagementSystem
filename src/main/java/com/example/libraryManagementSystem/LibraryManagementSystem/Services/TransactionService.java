 package com.example.libraryManagementSystem.LibraryManagementSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Transaction;
import com.example.libraryManagementSystem.LibraryManagementSystem.Repositories.TransactionRepo;

@Service
public class TransactionService {

    @Autowired
    TransactionRepo transactionRepo;

    public List<Transaction> getTransactionsByEmail(String email) {
        
        return transactionRepo.findByStudentEmail(email); // Assuming the method in repository
    }

    
}