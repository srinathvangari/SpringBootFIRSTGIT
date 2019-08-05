package com.srinath.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot1Application {
	
	 private static final Logger LOGGER = LogManager.getLogger(Springboot1Application.class);
	 

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
		
		LOGGER.info("Info level log message  Srinath  ");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
	}

}
