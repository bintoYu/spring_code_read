package com.test.factorybean;

import jdk.nashorn.internal.objects.annotations.Setter;


public class Food {
    private String foodName;
    private String foodPrice;

    public Food() {

    }

    public Food(String foodName, String foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }
}
