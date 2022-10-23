package com.example.udacity_tour_guide_app;

public class Guide {
    
    private final int nameOfImage;
    private final int nameOfLocation;
    private final int openTime;
    private final int image_resource;
    private final int phoneNumber;

    public Guide(int nameOfImage, int nameOfLocation, int image_resource, int phoneNumber , int openTime) {
        this.nameOfImage = nameOfImage;
        this.nameOfLocation = nameOfLocation;
        this.image_resource = image_resource;
        this.phoneNumber = phoneNumber;
        this.openTime=openTime;
    }
    
    public int getNameOfImage() {
        return nameOfImage;
    }

    public int getNameOfLocation() {
        return nameOfLocation;
    }

    public int getOpenTime() {
        return openTime;
    }

    public int getImage_resource() {
        return image_resource;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
