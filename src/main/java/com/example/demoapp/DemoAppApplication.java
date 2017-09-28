package com.example.demoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
@EnableAutoConfiguration
public class DemoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(DemoAppApplication.class, args);

	}

}
