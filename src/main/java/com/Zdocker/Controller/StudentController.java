package com.Zdocker.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class StudentController {

    @GetMapping("/get")
    public String Check(){
        return "Welcome to Docker World";
    }
}
