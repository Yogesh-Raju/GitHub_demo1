package com.org.students.cls.repository;

import com.org.students.cls.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRep extends MongoRepository<StudentModel,Integer> {

    public StudentModel findByName(String name);
}
