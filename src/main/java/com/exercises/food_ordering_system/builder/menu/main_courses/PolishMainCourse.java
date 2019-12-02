package com.exercises.food_ordering_system.builder.menu.main_courses;

import com.exercises.food_ordering_system.builder.Meal;

import java.util.ArrayList;

public class PolishMainCourse implements Meal {

    private ArrayList<String> polishnMeals = new ArrayList<>();

    @Override
    public String name() {
        return "PolishMainCourse";
    }

    @Override
    public double price() {
        return 40;
    }
}
