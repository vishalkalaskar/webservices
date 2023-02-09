package com.example.ms2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigusingone2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigusingone2Application.class, args);
	}

}
