package com.example.libraryManagementSystem.LibraryManagementSystem.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity(name = "transaction")
public class Transaction {
     @Id
    
    private String transactionId;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;  // Referencing the Book entity

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Student student;  // Referencing the Member entity

    private LocalDate borrowDate;
    private LocalDate returnDate;
    private int fineAmount; // If applicable

}
