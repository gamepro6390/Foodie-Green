package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"recipes"})
@ComponentScan(basePackages = {"store"})
public class FoodieGreenApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodieGreenApplication.class, args);
	}

}
