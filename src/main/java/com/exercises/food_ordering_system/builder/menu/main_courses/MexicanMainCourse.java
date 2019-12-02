package com.exercises.food_ordering_system.builder.menu.main_courses;

import com.exercises.food_ordering_system.builder.Meal;

import java.util.ArrayList;

public class MexicanMainCourse implements Meal {

    private ArrayList<String> mexicanMeals = new ArrayList<>();

    @Override
    public String name() {
        return "MexicanMainCourse";
    }

    @Override
    public double price() {
        return 40;
    }
}
