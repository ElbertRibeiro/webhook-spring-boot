package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigApp {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
