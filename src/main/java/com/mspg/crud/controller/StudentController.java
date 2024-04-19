package com.mspg.crud.controller;

import com.mspg.crud.model.Student;
import com.mspg.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping(path = "/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
     return ResponseEntity.status(HttpStatus.CREATED).body(studentService.saveStudent(student));
    }


    @GetMapping(path = "/get/student")
    public ResponseEntity<List<Student>> getAllStudents(){

        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable ("id") Long id){
    studentService.deleteStudent(id);

    }

    @PutMapping
    public ResponseEntity<Student> editStudent(Student student) {

        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.editStudent(student));
    }


}
