package com.example.kashishdafeCA.Repo;

import com.example.kashishdafeCA.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {
}