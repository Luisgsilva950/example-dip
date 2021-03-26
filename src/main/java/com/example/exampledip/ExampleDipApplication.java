package com.example.exampledip;

import com.example.exampledip.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleDipApplication {

	@Autowired Vehicle vehicle;

	public static void main(String[] args) {
		SpringApplication.run(ExampleDipApplication.class, args);
	}

	@Bean
	public void test(){
		vehicle.drive();
	}

}
