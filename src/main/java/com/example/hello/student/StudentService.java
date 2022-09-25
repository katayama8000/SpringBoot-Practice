package com.example.hello.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "James Bond",
                        LocalDate.of(2000, Month.JUNE, 5),
                        "gmail@gnail.com",
                        30));

    }

}
