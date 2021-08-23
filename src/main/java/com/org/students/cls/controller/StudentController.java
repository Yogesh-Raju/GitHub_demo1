package com.org.students.cls.controller;

import com.org.students.cls.model.StudentModel;
import com.org.students.cls.service.StudentServiceInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController
{
    @Autowired
    StudentServiceInit studentServiceInit;
    @PostMapping("/student")
    public void createStudnt(@RequestBody StudentModel studentModel) { studentServiceInit.createStudent(studentModel);}
    @GetMapping("/allStudent")
    public List<StudentModel> createStudent() { return studentServiceInit.getStudents(); }
    @GetMapping("/student/{name}")
    public StudentModel createStudent(@PathVariable String name) { return studentServiceInit.getStudent(name);}

}
