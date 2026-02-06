package com.Zdocker.Service;


import com.Zdocker.Entity.Student;
import com.Zdocker.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public ResponseEntity<Student> CreateStudent(Student student){
        Student save=studentRepository.save(student);
      return  ResponseEntity
              .status(HttpStatus.CREATED)
              .body(save);
    }

    public ResponseEntity<List<Student>>getallStudent(){
        List<Student>all=studentRepository.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(all);
    }
}
