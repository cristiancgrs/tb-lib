package com.transbank.mpos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MposTraductorApplication {

	private static final Logger logger = LoggerFactory.getLogger(MposTraductorApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MposTraductorApplication.class, args);
		logger.info("just a test info log");
	}
}
