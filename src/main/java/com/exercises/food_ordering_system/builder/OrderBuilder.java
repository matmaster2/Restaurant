package com.exercises.food_ordering_system.builder;

import com.exercises.food_ordering_system.builder.menu.Order;

public interface OrderBuilder {

    public void addDessert();

    public void addDrink();

    public void addMainCourse();

    public Order getOrder();
}
