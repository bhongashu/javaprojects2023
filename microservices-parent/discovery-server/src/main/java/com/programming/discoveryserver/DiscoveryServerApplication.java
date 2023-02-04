package com.programming.discoveryserver;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(DiscoveryServerApplication.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8761"));
		//SpringApplication.run(DiscoveryServerApplication.class, args);
		application.run(args);
		System.out.println("This is discovery server");

	}

}
