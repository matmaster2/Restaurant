package com.exercises.food_ordering_system.tasks;

import com.exercises.food_ordering_system.menu.DrinksMenu;
import com.exercises.food_ordering_system.menu.FoodMenu;
import com.exercises.food_ordering_system.menu.LunchesMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeOrder {

    public static void startOrdering() {

        int price = 0;
        List<String> myOrder = new ArrayList<>();

        System.out.println("INSTRUCTION: For navigation, please press the buttons written in square brackets []/n");
        System.out.println("What do you want - lunch[1] or drink[2] or both of them?[3]");
        choice();
    }

    private static void choice() {
        LunchesMenu lunch = new LunchesMenu();
        DrinksMenu drink = new DrinksMenu();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        try {
            switch (Integer.parseInt(userInput)) {
                case 1:
                    lunch.ordering();
                    break;
                case 2:
                    drink.ordering();
                    break;
                case 3:
                    lunch.ordering();
                    drink.ordering();
                    break;
                default:
                    System.out.println("Kliknales coś innego!");
                    startOrdering();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Musisz podać liczbę!");
            startOrdering();
        }

    }


}
