package com.exercises.food_ordering_system.builder.menu;

import com.exercises.food_ordering_system.builder.Meal;

import java.util.ArrayList;

public class Dessert implements Meal {

    private ArrayList<String> desserts = new ArrayList<>();

    public void setDessert(String dessert){
        desserts.add(dessert);
    }

    public String getDessert(){
        return desserts.get(0);
    }


    @Override
    public String name() {
        return "Dessert";
    }

    @Override
    public double price() {
        return 10;
    }
}
