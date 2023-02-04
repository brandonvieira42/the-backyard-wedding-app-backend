package com.backyardweddingapp;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@ComponentScan(basePackages = {"src/main/java"})
public class BackyardbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackyardbackendApplication.class, args);
		
	}
	
//	 @Bean
//	 public CorsFilter corsFilter() {
//	 	CorsConfiguration corsConfiguration = new CorsConfiguration();
//	 	corsConfiguration.setAllowCredentials(true);
//	 	corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//	 	corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type", 
//	 			"Accept", "Authorization", "Origin, Accept", "X-Requested-With", "Access-Control0Request-Method", "Access-Control-Request-Headers"));
//	 	corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin", 
//	 			"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
//	 	corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//	 	UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
//	 	urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
//	 	return new CorsFilter(urlBasedCorsConfigurationSource);
//	 }

}
