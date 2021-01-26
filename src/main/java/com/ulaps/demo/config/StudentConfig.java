package com.ulaps.demo.config;

import com.ulaps.demo.model.Student;
import com.ulaps.demo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student steven = new Student(1L,
                    "Steven Tan",
                    "stan581994@gmail.com",
                    LocalDate.of(1994, Month.MAY, 8));
            Student lisa = new Student(2L,
                    "Lisa Macamundong",
                    "lisamaca@gmail.com",
                    LocalDate.of(1998, Month.FEBRUARY, 19));

            studentRepository.saveAll(List.of(steven,lisa));
        };
    }
}
