package de.otto.quality.psr.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.logging.logback.LogbackLoggingSystem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SampleApplication {

	public final static Logger logger = LoggerFactory.getLogger(SampleApplication.class);

	/*
	 * @Bean public CommandLineRunner commandLineRunner(ApplicationContext context)
	 * { return args -> { }
	 */

	public static void main(String[] args) {
		logger.info("I am starting {}", args);
		ApplicationContext context = SpringApplication.run(SampleApplication.class, args);
		//context.getBean(YamlService.class).print();
		((YamlService) context.getBean("carlos")).print();
	}

}
