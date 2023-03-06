package com.codoacodo.Project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {

		SpringApplication.run(Project1Application.class, args);

		System.out.println("Hola Mundo con Spring");
	}


}
