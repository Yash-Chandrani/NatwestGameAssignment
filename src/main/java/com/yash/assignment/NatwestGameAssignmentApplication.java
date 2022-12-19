package com.yash.assignment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NatwestGameAssignmentApplication {

	private static final Logger logger = LoggerFactory.getLogger(NatwestGameAssignmentApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(NatwestGameAssignmentApplication.class, args);
		logger.info("Rock Paper Scissors Game started");
	}

}
