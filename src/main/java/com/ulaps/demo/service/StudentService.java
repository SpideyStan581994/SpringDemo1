package com.ulaps.demo.service;

import com.ulaps.demo.model.Student;
import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(1L,
                "Steven Tan",
                "stan581994@gmail.com",
                LocalDate.of(1994, Month.MAY,8),
                26));
    }


    public void addStudent(Student student){
        System.out.println(student);
    }
}
