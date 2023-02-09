package com.example.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataAccessException;

import com.example.jpa.entity.Actor;
import com.example.jpa.service.IActorMgmt;

@SpringBootApplication
public class JpaProject1Application {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(JpaProject1Application.class, args);
		
		IActorMgmt service=ctx.getBean("ActorService",IActorMgmt.class);
		
		try
		{
			Actor actor =new Actor();
			actor.setAname("Rajani");
			actor.setCategory("HERO");
			actor.setMobileNo(9999999999L);
			String resultmsg = service.registorActor(actor);
			System.out.println(resultmsg);
			
		}
		catch(DataAccessException deo)
		{
			deo.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
