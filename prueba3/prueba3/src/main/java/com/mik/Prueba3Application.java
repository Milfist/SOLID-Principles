package com.mik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.mik")
public class Prueba3Application {

	public static void main(String[] args) {
		SpringApplication.run(Prueba3Application.class, args);
	}
}
