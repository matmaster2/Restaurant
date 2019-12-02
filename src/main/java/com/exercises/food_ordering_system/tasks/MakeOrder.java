package com.exercises.food_ordering_system.tasks;

import com.exercises.food_ordering_system.builder.Order;
import com.exercises.food_ordering_system.builder.OrderBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeOrder {

    private static ArrayList<Order> orderList = new ArrayList<>();

    public static void startOrdering() {

        System.out.println("INSTRUCTION: For navigation, please press the buttons written in square brackets []\n");
        System.out.println("What do you want - lunch[1] or drink[2] or both of them?[3]");
        orderChoice();
        showSummary();
    }

    private static void orderChoice() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        try {
            switch (Integer.parseInt(userInput)) {
                case 1:
                    System.out.println("What kind of meal do you want?");
                    mainCourseChoice();
                    break;
                case 2:
                    System.out.println("What kind of drink do you want?");
                    drinkChoice();
                    break;
                case 3:
                    mainCourseChoice();
                    drinkChoice();
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

    private static void mainCourseChoice() {

        System.out.println(
                "Types of main courses:\n" +
                        "- Italian[1]\n" +
                        "- Mexican[2]\n" +
                        "- Polish[3]"
        );
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        OrderBuilder orderBuilder;


        try {
            switch (Integer.parseInt(userInput)) {
                case 1:
                    orderBuilder = new OrderBuilder();
                    Order orderItalianMainCourse = orderBuilder.orderItalianLunch();
                    orderList.add(orderItalianMainCourse);
                    break;
                case 2:
                    orderBuilder = new OrderBuilder();
                    Order orderMexicanMainCourse = orderBuilder.orderMexicanLunch();
                    orderList.add(orderMexicanMainCourse);
                    break;
                case 3:
                    orderBuilder = new OrderBuilder();
                    Order orderPolishMainCourse = orderBuilder.orderPolishLunch();
                    orderList.add(orderPolishMainCourse);
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


    private static void drinkChoice() {

        System.out.println(
                "Types of drinks:\n" +
                        "- drink [1]\n" +
                        "- drink with additive[2]"
        );
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        OrderBuilder orderBuilder;


        try {
            switch (Integer.parseInt(userInput)) {
                case 1:
                    orderBuilder = new OrderBuilder();
                    Order orderDrink = orderBuilder.orderDrink();
                    orderList.add(orderDrink);
                    break;
                case 2:
                    orderBuilder = new OrderBuilder();
                    Order orderDrinkWithAdditive = orderBuilder.orderDrinkWithAdditive();
                    orderList.add(orderDrinkWithAdditive);
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


    private static void showSummary() {
        System.out.println("Your meal: ");
        for (Order order : orderList) {
            order.showMeals();
            order.getPrice();
        }
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