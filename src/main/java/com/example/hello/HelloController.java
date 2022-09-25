package com.example.hello;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.Student;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/hello/list")
    public List<String> helloList() {
        return List.of("Hello", "World");
    }

    @GetMapping("/student")
    public List<Student> stu() {
        return List.of(
                new Student(
                        1L,
                        "James Bond",
                        LocalDate.of(2000, Month.JUNE, 5),
                        "gmail@gnail.com",
                        30));

    }
}
