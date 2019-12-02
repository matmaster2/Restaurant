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
/*
    private Drink drink;
    private DrinkAdditive drinkAdditive;
    private MainCourse mainCourse;
    private Dessert dessert;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public DrinkAdditive getDrinkAdditive() {
        return drinkAdditive;
    }

    public void setDrinkAdditive(DrinkAdditive drinkAdditive) {
        this.drinkAdditive = drinkAdditive;
    }

    public MainCourse getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

*/

