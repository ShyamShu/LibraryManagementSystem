package com.example.libraryManagementSystem.LibraryManagementSystem.Controllers;

import org.slf4j.Logger;
import java.util.*;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Book;
import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Transaction;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.BookService;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.StudentService;
import com.example.libraryManagementSystem.LibraryManagementSystem.Services.TransactionService;


@Controller
@RequestMapping("/admin")
public class TransactionControllerAdmin {

    @Autowired
    BookService bookService;

    @Autowired
    StudentService studentService;

    @Autowired
    TransactionService transactionService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/issueBook")
    public String issueBook(Model model)
    {
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        model.addAttribute("transactionForm", new Transaction());
        return "issueBook";
    }


    @PostMapping("/issueBook")
    public String processingBook()
    {
        logger.info("process is Start");
        return "redirect:/admin/adminDashboard";
    }





    @GetMapping("/transactionHistory")
    public String transactionHistory() {
        return "transactionHistoryform";
    }

    @PostMapping("/transactionHistory")
    public String getTheTransactionHistoryData(@RequestParam String email , Model model) {

         List<Transaction> transactions = transactionService.getTransactionsByEmail(email);

         if (transactions.isEmpty()) {
            model.addAttribute("message", "No Transactions Found for this email.");
        } else {
            model.addAttribute("transactions", transactions);
        }
        model.addAttribute("email", email);
        return "TransactionHistory";
    }
    






}
