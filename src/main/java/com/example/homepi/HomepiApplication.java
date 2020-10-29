package com.example.homepi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class HomepiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomepiApplication.class, args);
		System.out.println("start!!!!!!!!!!!!!!!!!!!!");
	}

}
