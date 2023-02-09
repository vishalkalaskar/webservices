package com.example.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.entity.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee,String>
{
      
   
    
}
