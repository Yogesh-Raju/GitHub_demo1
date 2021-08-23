package com.org.students.cls.service;

import com.org.students.cls.model.StudentModel;

import java.util.List;

public interface StudentServiceInit {


    public void createStudent(StudentModel S);
    public List<StudentModel> getStudents();
    public StudentModel getStudent(String name);

}
