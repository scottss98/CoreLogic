package com.triples.corelogic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CoreLogicDemoApplication {
	private static final Logger log = LoggerFactory.getLogger(CoreLogicDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CoreLogicDemoApplication.class, args);
	}
}
