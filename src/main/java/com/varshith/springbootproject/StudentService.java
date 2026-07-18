package com.varshith.springbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }
    public String deleteStudent(Integer id) {

        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student deleted successfully";
        }

        return "Student not found";
    }
    // Add Student
    public Student addStudent() {

        Student student = new Student();
        student.setName("Varshith");
        student.setAge(21);

        return studentRepository.save(student);
    }
    public Student updateStudent(Integer id, Student updatedStudent) {

        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return null;
        }

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setAge(updatedStudent.getAge());

        return studentRepository.save(existingStudent);
    }
    // Get All Students
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
