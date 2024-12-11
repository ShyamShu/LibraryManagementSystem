package com.example.libraryManagementSystem.LibraryManagementSystem.Entity;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "book")
public class Book {

    @Id
    private String bookId;

    @UniqueElements
    private String tittle;

    private boolean isAvailable;

    


    @OneToOne
    private Author author;

}
