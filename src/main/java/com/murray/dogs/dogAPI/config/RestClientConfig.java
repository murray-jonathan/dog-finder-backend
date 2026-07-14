package com.murray.dogs.dogAPI.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Value("${dog.api.url}")
    private String url;

    @Value("${dog.api.key}")
    private String apiKey;

    @Bean
    public RestClient restClient(){
        return RestClient.builder()
                .baseUrl(url)
                .defaultHeader("x-api-key", apiKey)
                .build();
    }
}
