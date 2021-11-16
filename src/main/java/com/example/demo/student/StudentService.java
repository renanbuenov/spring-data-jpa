package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Renan",
                "renanbueno@hotmail.com", LocalDate.of(1994, Month.DECEMBER,
                24),
                21));
    }
}
