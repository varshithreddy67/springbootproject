package com.varshith.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Add Student
    public Student addStudent() {

        Student student = new Student();
        student.setName("Varshith");
        student.setAge(21);

        return studentRepository.save(student);
    }

    // Get All Students
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}