package com.example.demo.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class EmployeeConfig {
    @Bean
    CommandLineRunner commandLineRunner( EmployeeRepository repository){
        return args -> {
            Employee dana = new Employee(
                    1L,
                    "Dana",
                    "ydana609@gmail.com",
                    1L,
                    "IT",
                    30
            );
            Employee andrew = new Employee(
                    1L,
                    "Andrew",
                    "andrewroxby@gmail.com",
                    1L,
                    "HR",
                    38
            );
            repository.saveAll(
                    Arrays.asList(dana, andrew)
            );
        };
    }
}
