package com.example.libraryManagementSystem.LibraryManagementSystem.Services;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagementSystem.LibraryManagementSystem.Entity.Student;
import com.example.libraryManagementSystem.LibraryManagementSystem.Repositories.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public Student findbyemail(String email) {
       
        return studentRepo.findByemail(email);
    }

    public Student saveStudent(Student student) throws Exception
    {
        String uuid = UUID.randomUUID().toString();
        student.setStudentId(uuid);
        try{
        return studentRepo.save(student);
        }
        catch(Exception e)
        {
            logger.info(e.toString());
            throw new Exception("problem is occured in adding user ");
        }
    }

}
