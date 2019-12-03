package com.exercises.food_ordering_system.builder;

import com.exercises.food_ordering_system.builder.menu.Dessert;
import com.exercises.food_ordering_system.builder.menu.Drink;
import com.exercises.food_ordering_system.builder.menu.DrinkAdditive;
import com.exercises.food_ordering_system.builder.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.PolishMainCourse;

public class OrderBuilder {

    public Order orderDrink(String drink){
        Order order = new Order();
        order.addMeal(new Drink(drink));
        return order;
    }

    public Order orderDrinkAdditive(String drinkAdditive){
        Order order = new Order();
        order.addMeal(new DrinkAdditive(drinkAdditive));
        return order;
    }

    public Order orderItalianLunch(String mainCourse, String dessert){
        Order order = new Order();
        order.addMeal(new ItalianMainCourse(mainCourse));
        order.addMeal(new Dessert(dessert));
        return order;
    }

    public Order orderMexicanLunch(String mainCourse, String dessert){
        Order order = new Order();
        order.addMeal(new MexicanMainCourse(mainCourse));
        order.addMeal(new Dessert(dessert));
        return order;
    }

    public Order orderPolishLunch(String mainCourse, String dessert){
        Order order = new Order();
        order.addMeal(new PolishMainCourse(mainCourse));
        order.addMeal(new Dessert(dessert));
        return order;
    }





}
