package com.varshith.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void displayStudent() {

        Student student = new Student();

        student.setName("Varshith Krishna Mohan Reddy Tummuru");
        student.setAge(21);

        studentRepository.save(student);

        System.out.println("Student Saved Successfully!");
    }
}