package com.exercises.food_ordering_system.tasks;

import com.exercises.food_ordering_system.builder.OrderBuilder;
import com.exercises.food_ordering_system.builder.menu.Drink;
import com.exercises.food_ordering_system.builder.menu.main_courses.MainCourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeOrder {

    public static void startOrdering() {




    }
}


/*
        int price = 0;
        List<String> myOrder = new ArrayList<>();

        System.out.println("INSTRUCTION: For navigation, please press the buttons written in square brackets []/n");
        System.out.println("What do you want - lunch[1] or drink[2] or both of them?[3]");
        choice();
    }

    private static void choice() {
        MainCourse mainCourse = new MainCourse();
        Drink drink = new Drink();
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        try {
            switch (Integer.parseInt(userInput)) {
                case 1:
                    mainCourse.ordering();
                    break;
                case 2:
                    drink.ordering();
                    break;
                case 3:
                    mainCourse.ordering();
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
*/