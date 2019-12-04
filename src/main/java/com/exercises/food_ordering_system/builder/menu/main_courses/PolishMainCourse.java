package com.exercises.food_ordering_system.builder.menu.main_courses;

import com.exercises.food_ordering_system.builder.Meal;

public class PolishMainCourse implements Meal {

    private String name;
    private double price;

    public PolishMainCourse(String name, double price) {
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
        return "PolishMainCourse{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
