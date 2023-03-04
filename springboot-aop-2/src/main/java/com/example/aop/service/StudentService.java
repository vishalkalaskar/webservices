package com.example.aop.service;

import org.springframework.stereotype.Service;

import com.example.aop.model.StudentModel;

@Service
public class StudentService
{
	public StudentModel addStudent(String fname,String lname)
	{
		 // Printing name of corresponding student
        System.out.println(
            "Add student service method called, firstname: "
            + fname + " Lastdname: " + lname);
 
        StudentModel stud = new StudentModel();
        stud.setFname(fname);
        stud.setLname(lname);
 
        // If first name i lesser than 4 words
        //  display below command
        if (fname.length() <= 3)
            throw new RuntimeException(
                "Length of firstname must be 4 or more");
 
        return stud;
    }
}

