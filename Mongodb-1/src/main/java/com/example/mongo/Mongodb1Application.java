package com.example.mongo;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example.mongo.entity.Employee;
import com.example.mongo.service.Employeemgntservice;
import com.example.mongo.service.IEmployeemgntService;

@SpringBootApplication
public class Mongodb1Application {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Mongodb1Application.class, args);
		
		IEmployeemgntService service = ctx.getBean("empservice",Employeemgntservice.class);
		/*try {
			 Employee emp = new Employee();
			 emp.setId("2");
			 emp.setEname("simaran");
			 emp.setEno(121);
			 emp.setEadd("pune,maharastra");
			 emp.setSalary(1234.33);
			 emp.setIsVaccinated(true);
			 System.out.println(service.saveEmployee(emp));
		}
		catch(DataAccessException dae)
		{
			dae.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		//******************SAVEALL**************
		/*
		 * try { List<Employee> employeelist = List.of(new
		 * Employee("3",123,"vanshree","pune",123.443,true), new
		 * Employee("4",124,"vansh","pune",123.443,true), new
		 * Employee("5",125,"vanshraj","pune",123.443,true), new
		 * Employee("6",126,"manav","pune",123.443,true), new
		 * Employee("7",127,"virat","pune",123.443,true)); String
		 * resultmsg=service.SaveAllEmployee(employeelist);
		 * System.out.println(resultmsg);
		 * 
		 * } catch(DataAccessException dae) { dae.printStackTrace(); } catch(Exception
		 * e) { e.printStackTrace(); }
		 */
		
		service.showAllEmployee().forEach(System.out::println);
	}

}
