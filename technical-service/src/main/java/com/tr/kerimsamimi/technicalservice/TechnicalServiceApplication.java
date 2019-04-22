package com.tr.kerimsamimi.technicalservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author kerimsamimi
 * @since  22/04/2019
 */

@SpringBootApplication
public class TechnicalServiceApplication {

	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(TechnicalServiceApplication.class);
	    }

	    public static void main(String[] args) {
	        SpringApplication.run(TechnicalServiceApplication.class, args);
	    }
	
	

}
