package com.csc340.restapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiDemoApplication.class, args);
                
                RestApiController apiTest = new RestApiController();
                apiTest.getMeow();
                System.exit(0);
	}

}
