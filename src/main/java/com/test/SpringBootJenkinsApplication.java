package com.test;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("application started.");
		
		logger.info("after changes in init method.");
		
		logger.info("after changes in init method. pipeline config.");
		
		logger.info("after changes in init method. pipeline config. Today");
		
		logger.info("after changes in init method. pipeline config. Today 05");
		
		logger.info("after changes in init method. pipeline config. B4");

		logger.info("application started. evoke");
	}

	public static void main(String[] args) {
		
		logger.info("application Executed.");
		
		logger.info("after changes in sts tool.");
		
		logger.info("after changes in init method. pipeline config. Today 05");
		
		logger.info("application Executed. zensar.");

		logger.info("application started. evoke");
		
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
