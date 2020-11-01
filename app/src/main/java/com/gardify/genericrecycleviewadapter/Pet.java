package com.gardify.genericrecycleviewadapter;

public class Pet {
    private String name;
    private String pictureUrl;

    public Pet(String name, String pictureUrl) {
        this.name = name;
        this.pictureUrl = pictureUrl;
    }
    public String getPictureUrl() {
        return pictureUrl;
    }

    public String getName() {
        return name;
    }
}
