package com.exercises.food_ordering_system;

import com.exercises.food_ordering_system.tasks.OrderManager;

public class Main {

    public static void main(String[] args) {
        new OrderManager().startOrdering();
    }
}
