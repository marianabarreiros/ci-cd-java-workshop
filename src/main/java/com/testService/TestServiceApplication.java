package com.testService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
 * javadoc.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration
public class TestServiceApplication {
	/***
	 * javadoc.
	 */

	/**
	 * @param args this is the arg of the main method
	 * @param args
	 */

	public static void main(final String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
		System.exit(0);
	}

}
