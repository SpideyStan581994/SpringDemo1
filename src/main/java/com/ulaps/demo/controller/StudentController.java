package com.ulaps.demo.controller;

import com.ulaps.demo.model.Student;
import com.ulaps.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
       return studentService.getStudents();
    }

    @PostMapping
    public void addStudent(){
        studentService.addStudent(new Student(2L,
                "John Doe",
                "johnDoe@gmail.com",
                LocalDate.of(1992, Month.DECEMBER,18),
                28));
    }

}
