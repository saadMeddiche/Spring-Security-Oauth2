package com.security.springsecurityoauth2;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSecurityOauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityOauth2Application.class, args);
	}

	@Bean
	public ApplicationRunner createDefaultData(){
		return new ApplicationRunner() {

			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("\n I am functional \n");
			}

		};
	}




}
