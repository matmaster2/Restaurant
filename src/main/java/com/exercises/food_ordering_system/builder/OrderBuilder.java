package com.exercises.food_ordering_system.builder;

import com.exercises.food_ordering_system.builder.menu.Dessert;
import com.exercises.food_ordering_system.builder.menu.Drink;
import com.exercises.food_ordering_system.builder.menu.DrinkAdditive;
import com.exercises.food_ordering_system.builder.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.PolishMainCourse;

public class OrderBuilder {

    public Order orderDrink(){
        Order order = new Order();
        order.addMeal(new Drink());
        return order;
    }

    public Order orderDrinkWithAdditive(){
        Order order = new Order();
        order.addMeal(new Drink());
        order.addMeal(new DrinkAdditive());
        return order;
    }

    public Order orderItalianLunch(){
        Order order = new Order();
        order.addMeal(new ItalianMainCourse());
        order.addMeal(new Dessert());
        return order;
    }

    public Order orderMexicanLunch(){
        Order order = new Order();
        order.addMeal(new MexicanMainCourse());
        order.addMeal(new Dessert());
        return order;
    }

    public Order orderPolishLunch(){
        Order order = new Order();
        order.addMeal(new PolishMainCourse());
        order.addMeal(new Dessert());
        return order;
    }


}
