package com.exercises.food_ordering_system.meals.menu;

import com.exercises.food_ordering_system.meals.Meal;

public class DrinkAdditive implements Meal {

    private String name;
    private double price;

    public DrinkAdditive(String name, double price) {
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
        return " " + name +
                ", price=" + price;
    }
}
