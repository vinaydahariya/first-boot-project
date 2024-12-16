package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@ComponentScan("com.first")
//@EnableAutoConfiguration
public class FirstBootProjectApplication {

	public static void main(String[] args) {
		// ye line spring boot k application ko start kr rhi hai
		SpringApplication.run(FirstBootProjectApplication.class, args);
	}

}
