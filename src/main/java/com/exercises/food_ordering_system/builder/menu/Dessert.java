package com.exercises.food_ordering_system.builder.menu;

import com.exercises.food_ordering_system.builder.Meal;

import java.util.ArrayList;

import static com.exercises.food_ordering_system.utility.fillingListFromFile.fillAList;

public class Dessert implements Meal {

    private String name;

    public Dessert(String name){
        this.name = name;
    }

    private static String filePath = "food_ordering_system//foods_and_drinks//lunch//desserts//desserts";
    public static ArrayList<String> listOfDesserts = fillAList(filePath);



    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
