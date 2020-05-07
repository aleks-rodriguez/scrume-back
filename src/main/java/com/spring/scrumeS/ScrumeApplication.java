package com.spring.scrumeS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ComponentScan(basePackages = "com.spring")
@EnableJpaRepositories(value = { "com.spring.security","com.spring.jwt", "com.spring.repository" })
@EntityScan(value = { "com.spring.model" })
@SpringBootApplication
@EnableScheduling
public class ScrumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrumeApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET",
						"PUT", "DELETE", "POST");
			}
		};
	}
}