package com.murray.dogs.dogAPI.dto;

public class Dog {

    private String name;
    private String life_span;
    private String temperament;
    private String reference_image_id;
    private String imageUrl;


    public Dog() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLife_span() {
        return life_span;
    }

    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }

    public String getReference_image_id(){
        return reference_image_id;
    }

    public void setReference_image_id(String reference_image_id){
        this.reference_image_id = reference_image_id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
