package com.exercises.food_ordering_system.builder;

import com.exercises.food_ordering_system.builder.menu.Order;

public class OrderDirector {

    private OrderBuilder orderBuilder = null;

    public OrderDirector(OrderBuilder orderBuilder){
        this.orderBuilder=orderBuilder;
    }

    public void constructOrder(){
        orderBuilder.addDrink();
        orderBuilder.addMainCourse();
        orderBuilder.addDessert();
    }

    public Order getOrder(){
        return orderBuilder.getOrder();
    }

}
