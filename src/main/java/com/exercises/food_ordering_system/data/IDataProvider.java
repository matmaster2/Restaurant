package com.exercises.food_ordering_system.data;

import com.exercises.food_ordering_system.model.Meal;

import java.util.ArrayList;

public interface IDataProvider {

    ArrayList<Meal> getDrinks();

    ArrayList<Meal> getDrinkAdditive();

    ArrayList<Meal> getDessert();

    ArrayList<Meal> getItalianMainCourse();

    ArrayList<Meal> getMexicanMainCourse();

    ArrayList<Meal> getPolishMainCourse();
}
