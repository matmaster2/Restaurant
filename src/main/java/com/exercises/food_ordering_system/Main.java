package com.exercises.food_ordering_system;


import com.exercises.food_ordering_system.tasks.MakeOrder;

public class Main {

    public static void main(String[] args) {
        MakeOrder makeOrder = new MakeOrder();
        makeOrder.startOrdering();
    }
}
