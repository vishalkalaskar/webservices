package com.example.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringbootAop2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAop2Application.class, args);
	}

}
