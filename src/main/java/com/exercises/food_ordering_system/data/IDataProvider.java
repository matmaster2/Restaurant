package com.exercises.food_ordering_system.data;

import com.exercises.food_ordering_system.builder.Meal;
import com.exercises.food_ordering_system.builder.menu.Dessert;
import com.exercises.food_ordering_system.builder.menu.Drink;
import com.exercises.food_ordering_system.builder.menu.DrinkAdditive;
import com.exercises.food_ordering_system.builder.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.PolishMainCourse;

import java.util.ArrayList;
import java.util.List;

public interface IDataProvider {

    ArrayList<Drink> getDrinks();

    ArrayList<DrinkAdditive> getDrinkAdditive();

    ArrayList<Dessert> getDessert();

    ArrayList<ItalianMainCourse> getItalianMainCourse();

    ArrayList<MexicanMainCourse> getMexicanMainCourse();

    ArrayList<PolishMainCourse> getPolishMainCourse();
}
