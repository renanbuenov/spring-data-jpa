package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student renan = new Student(
                    "Renan",
                    "renanbueno@hotmail.com", LocalDate.of(1994, DECEMBER,
                    24));
            Student rafael = new Student(
                    "Rafael",
                    "rafaelbueno@hotmail.com", LocalDate.of(1986, SEPTEMBER,
                    24));
            Student regiane = new Student(
                    "Regiane",
                    "regianebueno@hotmail.com", LocalDate.of(1989, JULY,
                    24));
            repository.saveAll(List.of(renan, rafael, regiane));

        };
    }
}
