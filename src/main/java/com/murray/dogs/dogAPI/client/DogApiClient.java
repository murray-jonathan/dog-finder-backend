package com.murray.dogs.dogAPI.client;

import com.murray.dogs.dogAPI.config.RestClientConfig;
import com.murray.dogs.dogAPI.dto.Dog;
import com.murray.dogs.dogAPI.dto.DogImage;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
public class DogApiClient {

    private final RestClient restClient;

    public DogApiClient(RestClient restClient){
        this.restClient = restClient;
    }

    public List<Dog> searchName(String name){
        return restClient.get()
                .uri("/breeds/search?q={name}", name)
                .retrieve()
                .body(new ParameterizedTypeReference<List<Dog>>() {});
    }

    public DogImage getImage(String imageId){
        return restClient.get()
                .uri("/images/" + imageId)
                .retrieve()
                .body(DogImage.class);
    }
}
