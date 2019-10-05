package com.db.fractus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.db.fractus.repository")
public class FractusApplication {

	public static void main(String[] args) {
		SpringApplication.run(FractusApplication.class, args);
	}

}
