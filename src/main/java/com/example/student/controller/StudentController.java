package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.model.StudentRequest;
import com.example.student.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;
    @PostMapping
    public Student createStudent(@RequestBody StudentRequest studentRequest) {
        return studentService.createStudent(studentRequest);
    }
    @GetMapping
    public Student getStudent(Long rollno) {
        return studentService.getStudent(rollno);
    }
    @PutMapping
    public Student update(@RequestBody Student student){
        return studentService.update(student);
    }
    @DeleteMapping
    public String del(long rollno){
        studentService.del(rollno);
        return "-- Record deleted";
    }
}


