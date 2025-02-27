package com.unir.msthelibraryoperator;

import com.unir.msthelibraryoperator.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MsTheLibraryOperatorApplication {
    private final AppConfig config;

    @Autowired
    public MsTheLibraryOperatorApplication(AppConfig config) {
        this.config = config;
    }
    public static void main(String[] args) {
        SpringApplication.run(MsTheLibraryOperatorApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                String regex = "\\s*,\\s*";

                registry.addMapping("/**")
                        .allowedOrigins(config.getAllowedOrigins().split(regex))
                        .allowedMethods(config.getAllowedMethods().split(regex))
                        .allowedHeaders(config.getAllowedHeaders().split(regex));
            }
        };
    }

}
