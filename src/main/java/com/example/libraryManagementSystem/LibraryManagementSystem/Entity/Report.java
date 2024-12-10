package com.example.libraryManagementSystem.LibraryManagementSystem.Entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor

public class Report {

    private String studentID;
    private String studentName;
    private List<Transaction> transactions;

}
