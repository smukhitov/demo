package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student hadija = new Student(
                    "Hadija",
                    "hadija.jamal@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 3)
            );

            repository.saveAll(
                    List.of(mariam, hadija)
            );
        };
    }

}
