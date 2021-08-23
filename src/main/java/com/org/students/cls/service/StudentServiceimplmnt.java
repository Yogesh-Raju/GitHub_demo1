package com.org.students.cls.service;


import com.org.students.cls.model.StudentModel;
import com.org.students.cls.repository.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceimplmnt implements StudentServiceInit
{
    @Autowired
    StudentRep studentRep;

    @Override
    public void createStudent(StudentModel s) {
        studentRep.save(s);
    }

    @Override
    public List<StudentModel> getStudents() {
        return studentRep.findAll();
    }

    @Override
    public StudentModel getStudent(String name) {
        return studentRep.findByName(name);
    }
}
