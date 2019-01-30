package de.otto.quality.psr.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.logback.LogbackLoggingSystem;

@SpringBootApplication
public class SampleApplication {

	public final static Logger logger = LoggerFactory.getLogger(SampleApplication.class);


	public static void main(String[] args) {
		logger.info("I am starting {}", args);
		SpringApplication.run(SampleApplication.class, args);
	}

}

