package com.mongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkins01Application {

	static Logger log = LoggerFactory.getLogger(SpringJenkins01Application.class);
	
	public void init() {
		log.info("My App In Init Method, 3rd Time");
	}
	
	public static void main(String[] args) {
		log.info("My App Executing...........");
		SpringApplication.run(SpringJenkins01Application.class, args);
	}

}
