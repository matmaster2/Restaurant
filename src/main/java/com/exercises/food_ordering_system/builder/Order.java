package com.exercises.food_ordering_system.builder;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public double getPrice() {
        double price = 0;

        for (Meal meal : meals) {
            price = price + meal.price();
        }

        return price;
    }

    public void showMeals() {
        for (Meal meal : meals) {
            System.out.println(meal.name() +", price: " +  meal.price());
        }
    }

}