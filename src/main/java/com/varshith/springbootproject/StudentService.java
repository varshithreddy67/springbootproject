package com.varshith.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void displayStudent() {

        // Create Student
        Student student = new Student();
        student.setName("Varshith Krishna Mohan Reddy Tummuru");
        student.setAge(21);

        // Save Student
        studentRepository.save(student);
        System.out.println("Student Saved Successfully!");

        // Find All Students
        System.out.println("\nStudents in Database:\n");

        for (Student s : studentRepository.findAll()) {
            System.out.println("-------------------------");
            System.out.println("ID   : " + s.getId());
            System.out.println("Name : " + s.getName());
            System.out.println("Age  : " + s.getAge());
        }

        // Find Student By ID
        System.out.println("\nFinding Student By ID...\n");

        studentRepository.findById(1).ifPresent(studentData -> {
            System.out.println("-------------------------");
            System.out.println("ID   : " + studentData.getId());
            System.out.println("Name : " + studentData.getName());
            System.out.println("Age  : " + studentData.getAge());
        });

        // Count Students
        System.out.println("\nTotal Students : " + studentRepository.count());

        // Check Student Exists
        System.out.println("Student with ID 1 Exists : "
                + studentRepository.existsById(1));

        // Delete Student
        System.out.println("\nDeleting Student with ID 1...");

        studentRepository.deleteById(1);

        System.out.println("Student Deleted Successfully!");

        // Count After Delete
        System.out.println("Remaining Students : "
                + studentRepository.count());

        // Check Exists After Delete
        System.out.println("Student with ID 1 Exists : "
                + studentRepository.existsById(1));
    }
}