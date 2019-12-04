package com.exercises.food_ordering_system.builder.menu;

import com.exercises.food_ordering_system.builder.Meal;

public class Dessert implements Meal {

    private String name;
    private double price;

    public Dessert(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
