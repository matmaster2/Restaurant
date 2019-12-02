package com.exercises.food_ordering_system.builder.menu;

import com.exercises.food_ordering_system.builder.Meal;

import java.util.ArrayList;

public class DrinkAdditive implements Meal {

    private ArrayList<String> drinksAdditive = new ArrayList<>();

    public void setDrinkAdditive(String drinkAdditive){
        drinksAdditive.add(drinkAdditive);
    }

    public String getrinkAdditive(){
        return drinksAdditive.get(0);
    }

    @Override
    public String name() {
        return "DrinkAdditive";
    }

    @Override
    public double price() {
        return 3;
    }
}
