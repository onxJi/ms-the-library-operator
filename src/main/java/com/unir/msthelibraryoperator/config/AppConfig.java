package com.unir.msthelibraryoperator.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppConfig {

    private String authUri;
    private boolean ignoreSession;
    private String allowedOrigins;
    private String allowedMethods;
    private String allowedHeaders;
    private String allowedPaths;
    private boolean isProd;
    private String correo;

}