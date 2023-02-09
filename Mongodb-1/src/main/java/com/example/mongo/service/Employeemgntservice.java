package com.example.mongo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongo.entity.Employee;
import com.example.mongo.repository.IEmployeeRepo;


@Service("empservice")
public class Employeemgntservice implements IEmployeemgntService 
{
	
	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public String saveEmployee(Employee e) {
		
		return "MongoD doc is save with id value  :"+empRepo.insert(e).getId();
	}

	@Override
	public String SaveAllEmployee(List<Employee> list) {
		if(list != null)
		{
			Iterable<Employee> empEntities = empRepo.saveAll(list);
			List<String> ids = new ArrayList();
			for(Employee employee: empEntities)
			{
				ids.add(employee.getId());
			
			}
			return ids.size()+"object r saved having ids values"+ids;
		}
		return "problem in batch insertion";
	}

	@Override
	public List<Employee> showAllEmployee() {
		
		return empRepo.findAll();
	}

	


}
