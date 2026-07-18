package com.varshith.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    @Autowired
    private Student student;

    public void displayStudent() {

        student.setName("Varshith Krishna Mohan Reddy Tummuru");
        student.setAge(21);

        System.out.println("Student Name : " + student.getName());
        System.out.println("Student Age : " + student.getAge());
    }
}