package com.example.libraryManagementSystem.LibraryManagementSystem.Entity;



import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Entity(name = "Student")
public class Student {

    @Id
    private String studentId;

    @UniqueElements
    private String email;

    private String password;

    private String name;

    

}
