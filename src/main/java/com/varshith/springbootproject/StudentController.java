package com.varshith.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Add Student (Temporary)
    @GetMapping("/add")
    public Student addStudent() {
        return studentService.addStudent();
    }

    // Get All Students
    @GetMapping("/students")
    public Iterable<Student> getStudents() {
        return studentService.getAllStudents();
    }
}