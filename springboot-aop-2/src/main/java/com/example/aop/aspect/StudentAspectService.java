package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAspectService {

	@Pointcut("execution(* com.example.aop.aspect.StudentAspectService.*(..)) ")

	// pointcut signature private void anyStudentService() { }

	// @Around(value ="execution(*
	// com.example.aop.aspect.StudentAspectService.*(..)) and args(fname,lname)")

	@Around("anyStudentService() && args(fname, lname)")
	public Object beforeAdvice(ProceedingJoinPoint proceedingJoinPoint, String fname, String lname) throws Throwable { // Print
																														// statements
		System.out.println("-----------------------------");
		System.out.println("Around method:" + proceedingJoinPoint.getSignature());
		System.out.println("Before calling joint point service method");

		Object stud = proceedingJoinPoint.proceed();

		// Print statement
		System.out.println("After calling joint point service method ");

		return stud;
	}

	@Before(value = "execution(* com.example.aop.aspect.StudentAspectService.*(..)) and args(fname,lname)")
	public void beforeAdvice(JoinPoint joinPoint, String fname, String lname) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Employee with name - " + fname + " and id - " + lname);
	}

	@After(value = "execution(* com.example.aop.aspect.StudentAspectService.*(..)) and args(fname,lname)")
	public void afterAdvice(JoinPoint joinPoint, String fname, String lname) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with first_name - " + fname + " and lastname - " + lname);
	}
}
