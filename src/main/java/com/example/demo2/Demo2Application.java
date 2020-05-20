package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo2Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
    	SpringApplication.run(Demo2Application.class, args);
		System.out.println("Hello world");
    }

}
