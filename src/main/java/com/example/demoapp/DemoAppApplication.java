package com.example.demoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(DemoAppApplication.class, args);

	}

}
