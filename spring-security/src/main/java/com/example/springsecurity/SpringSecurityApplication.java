package com.example.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@PropertySource(value="classpath:application.properties")
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		
		//SpringApplication app=new SpringApplication();
		//app.setDefaultProperties(Collections.singletonMap("spring.devtools.add-properties", "false"));
		//app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
		//app.run(args);
	}

}
