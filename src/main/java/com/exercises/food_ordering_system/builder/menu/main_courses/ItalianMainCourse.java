package com.exercises.food_ordering_system.builder.menu.main_courses;

import com.exercises.food_ordering_system.builder.Meal;

import java.util.ArrayList;

public class ItalianMainCourse implements Meal {

    private ArrayList<String> italianMeals = new ArrayList<>();


    @Override
    public String name() {
        return "ItalianMainCourse";
    }

    @Override
    public double price() {
        return 40;
    }
}
