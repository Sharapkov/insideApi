package com.inside.insideApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import security.RsaProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaProperties.class)
public class InsideApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsideApiApplication.class, args);
	}

}
