package com.exercises.food_ordering_system.data;

import com.exercises.food_ordering_system.meals.menu.Dessert;
import com.exercises.food_ordering_system.meals.menu.Drink;
import com.exercises.food_ordering_system.meals.menu.DrinkAdditive;
import com.exercises.food_ordering_system.meals.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.meals.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.meals.menu.main_courses.PolishMainCourse;

import java.util.ArrayList;

public interface IDataProvider {

    ArrayList<Drink> getDrinks();

    ArrayList<DrinkAdditive> getDrinkAdditive();

    ArrayList<Dessert> getDessert();

    ArrayList<ItalianMainCourse> getItalianMainCourse();

    ArrayList<MexicanMainCourse> getMexicanMainCourse();

    ArrayList<PolishMainCourse> getPolishMainCourse();
}
