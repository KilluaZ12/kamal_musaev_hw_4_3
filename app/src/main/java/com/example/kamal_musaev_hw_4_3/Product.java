package com.example.kamal_musaev_hw_4_3;

import java.io.Serializable;

public class Product implements Serializable {

    String description, title, sum;
    int image, color;

    public Product(String title, String description, int image, String sum, int color) {
        this.description = description;
        this.title = title;
        this.image = image;
        this.sum = sum;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }
}
