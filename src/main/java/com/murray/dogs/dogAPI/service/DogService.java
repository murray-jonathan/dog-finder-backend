package com.murray.dogs.dogAPI.service;

import com.murray.dogs.dogAPI.client.DogApiClient;
import com.murray.dogs.dogAPI.dto.Dog;
import com.murray.dogs.dogAPI.dto.DogImage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    private final DogApiClient dogApiClient;

    public DogService(DogApiClient dogApiClient){
        this.dogApiClient = dogApiClient;
    }

    public List<Dog> searchForName(String name){
        List<Dog> dogs = dogApiClient.searchName(name);

        for (Dog dog : dogs){
            if (dog.getReference_image_id() != null){
                DogImage image = dogApiClient.getImage(
                        dog.getReference_image_id()
                );

                if (image != null){
                    dog.setImageUrl(image.getUrl());
                }

            }
        }

        return dogs;
    }
}
