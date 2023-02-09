package com.example.ms2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfig1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfig1Application.class, args);
	}

}
