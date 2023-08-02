package com.example.grarary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GrararyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrararyApplication.class, args);
	}

}
