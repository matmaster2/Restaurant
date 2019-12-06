package com.exercises.food_ordering_system.meals;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private static List<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    public static double showTotalPrice() {
        double price = 0;

        for (Meal meal : meals) {
            price = price + meal.getPrice();
        }
        System.out.println("Total price: " + price);
        return price;
    }

    public static void showWholeOrder() {
        for (Meal meal : meals) {
            System.out.println(meal.getName() + ", Price: " + meal.getPrice());
        }
    }

}