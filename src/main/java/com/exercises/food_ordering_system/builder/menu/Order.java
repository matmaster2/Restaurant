package com.exercises.food_ordering_system.builder.menu;

import com.exercises.food_ordering_system.builder.menu.main_courses.MainCourse;

public class Order {

    private Drink drink;
    private MainCourse mainCourse;
    private Dessert dessert;

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
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


}
