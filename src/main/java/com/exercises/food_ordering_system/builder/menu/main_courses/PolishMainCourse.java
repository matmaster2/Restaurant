package com.exercises.food_ordering_system.builder.menu.main_courses;

import com.exercises.food_ordering_system.builder.Meal;

import java.util.ArrayList;

import static com.exercises.food_ordering_system.utility.fillingListFromFile.fillAList;

public class PolishMainCourse implements Meal {

    public PolishMainCourse(String name) {
        this.name = name;
    }

    private String name;

    private static String filePath = "food_ordering_system//foods_and_drinks//lunch//main_courses//polish//polish_main_courses";
    public static ArrayList<String> listOfPolishMainCourses = fillAList(filePath);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 40;
    }
}
