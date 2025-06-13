package com.example.demoOpenSearch;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoOpenSearchApplication {
	//log4j
	private static final Logger logger = LogManager.getLogger(DemoOpenSearchApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenSearchApplication.class, args);
		logger.info("Hello this is my App");
	}

}
