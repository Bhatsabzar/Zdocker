package com.Zdocker.Service;


import com.Zdocker.Entity.Student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    void shouldCreateStudent() {
        Student student = new Student();
        student.setStudentName("sabzar");

        ResponseEntity<Student> response =
                studentService.CreateStudent(student);
        assertEquals(
                HttpStatus.CREATED.value(),
                response.getStatusCode().value()
        );

        assertNotNull(response.getBody());
    }
}

