package com.varshith.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootprojectApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringbootprojectApplication.class, args);

        Student student = context.getBean(Student.class);

        student.setName("Varshith Krishna Mohan Reddy Tummuru");
        student.setAge(21);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}