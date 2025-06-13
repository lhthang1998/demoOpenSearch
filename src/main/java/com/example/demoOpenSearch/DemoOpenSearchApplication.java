package com.example.demoOpenSearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoOpenSearchApplication {
	private static final Logger logger
			= LoggerFactory.getLogger(DemoOpenSearchApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoOpenSearchApplication.class, args);
		logger.info("Hello this is my App");
	}

}
