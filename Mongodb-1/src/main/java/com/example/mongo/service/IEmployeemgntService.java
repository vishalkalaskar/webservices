package com.example.mongo.service;

import java.util.List;

import com.example.mongo.entity.Employee;

public interface IEmployeemgntService 
{
     public String saveEmployee(Employee e);
     public  String SaveAllEmployee(List<Employee> list);
     public List<Employee> showAllEmployee();
     
}
