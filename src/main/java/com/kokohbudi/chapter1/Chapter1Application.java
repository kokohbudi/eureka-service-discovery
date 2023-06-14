package com.kokohbudi.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Chapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}

}

