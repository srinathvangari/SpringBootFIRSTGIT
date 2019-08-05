package com.srinath.springboot1;


 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
	
	 private static final Logger LOGGER = LogManager.getLogger(FirstRestController.class);
	
	@GetMapping(path="hello-bean  jjj" )
	public String helloBean(){
		LOGGER.info("Info level log message  Srinath HH  ");
        LOGGER.debug("Debug level log message");
        LOGGER.error("Error level log message");
		
		return "Hello Bean rr- 24 Jun 99 55 Srinath";
	}

}
