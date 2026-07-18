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

        System.out.println("\nStudents in Database:\n");

        for (Student s : studentRepository.findAll()) {
            System.out.println("-------------------------");
            System.out.println("ID   : " + s.getId());
            System.out.println("Name : " + s.getName());
            System.out.println("Age  : " + s.getAge());
            System.out.println("\nFinding Student By ID...\n");

            studentRepository.findById(1).ifPresent(studentData -> {

                System.out.println("-------------------------");
                System.out.println("ID   : " + studentData.getId());
                System.out.println("Name : " + studentData.getName());
                System.out.println("Age  : " + studentData.getAge());

                System.out.println("\nDeleting Student with ID 1...");

                studentRepository.deleteById(1);

                System.out.println("Student Deleted Successfully!");

                System.out.println("Remaining Students : " + studentRepository.count());

            });
            System.out.println("\nTotal Students : " + studentRepository.count());
            System.out.println("\nStudent with ID 1 Exists : " + studentRepository.existsById(1));
        }
    }
}