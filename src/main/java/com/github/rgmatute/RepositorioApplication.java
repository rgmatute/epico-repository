package com.github.rgmatute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = { "com.github.rgmatute.api", "com.github.rgmatute.domain", "com.github.rgmatute.repository", "com.github.rgmatute.services" })
public class RepositorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepositorioApplication.class, args);
	}

}
