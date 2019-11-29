package com.exercises.food_ordering_system.builder.menu;

import java.util.ArrayList;

public class Dessert {

    private ArrayList<String> dessert = new ArrayList<>();

    public void setDessert(){
        dessert.add("tea");
    }

    public String getDessert(){
        return dessert.get(0);
    }



}
