package com.exercises.food_ordering_system.builder;

import com.exercises.food_ordering_system.builder.menu.Dessert;
import com.exercises.food_ordering_system.builder.menu.Drink;
import com.exercises.food_ordering_system.builder.menu.DrinkAdditive;
import com.exercises.food_ordering_system.builder.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.PolishMainCourse;

public class OrderBuilder {

    public Order orderDrink(Drink drink){
        Order order = new Order();
        order.addMeal(drink);
        return order;
    }

    public Order orderDrinkAdditive(DrinkAdditive drinkAdditive){
        Order order = new Order();
        order.addMeal(drinkAdditive);
        return order;
    }

    public Order orderDessert(Dessert dessert){
        Order order = new Order();
        order.addMeal(dessert);
        return order;
    }


    public Order orderItalianMainCourse(ItalianMainCourse italianMainCourse){
        Order order = new Order();
        order.addMeal(italianMainCourse);
        return order;
    }

    public Order orderMexicanMainCourse(MexicanMainCourse mexicanMainCourse){
        Order order = new Order();
        order.addMeal(mexicanMainCourse);
        return order;
    }

    public Order orderPolishMainCourse(PolishMainCourse polishMainCourse){
        Order order = new Order();
        order.addMeal(polishMainCourse);
        return order;
    }





}
