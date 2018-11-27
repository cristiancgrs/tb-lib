package com.transbank.mpos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentLibApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(PaymentLibApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PaymentLibApplication.class, args);
		logger.info("Iniciando aplicacion - PaymentLibApplication");
	}
}
