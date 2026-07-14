package com.murray.dogs.dogAPI.controller;

import com.murray.dogs.dogAPI.dto.Dog;
import com.murray.dogs.dogAPI.service.DogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService){
        this.dogService = dogService;

    }

    @GetMapping
    public List<Dog> searchDog(@RequestParam String name){
        return dogService.searchForName(name);
    }



}
