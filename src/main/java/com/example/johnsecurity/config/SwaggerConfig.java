package com.example.johnsecurity.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    OpenAPI openAPI(){
        return new OpenAPI().info(new Info().title("Simple login form with spring security").summary("created by Revocatus Joseph Nduki").description("Spring boot application that uses login + spring security session based Authentication"));
    }
}
