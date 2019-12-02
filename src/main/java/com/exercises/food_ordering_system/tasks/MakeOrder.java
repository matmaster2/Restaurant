package com.exercises.food_ordering_system.tasks;

import com.exercises.food_ordering_system.builder.Order;
import com.exercises.food_ordering_system.builder.OrderBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.ClassLoader.getSystemClassLoader;

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
        ArrayList<String> listOfMainCourses = fillAList("food_ordering_system//foods_and_drinks//type_of_main_courses");
        listOfMainCourses.forEach(System.out::println);

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
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            System.out.println("Musisz podać liczbę!");
            System.exit(0);
        }
    }


    private static void drinkChoice() {

        ArrayList<String> listOfDrinks = fillAList("food_ordering_system//foods_and_drinks//type_of_drinks");
        listOfDrinks.forEach(System.out::println);

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
                    System.exit(0);;
                    break;
            }
        } catch (Exception e) {
            System.out.println("Musisz podać liczbę!");
            System.exit(0);
        }
    }


    private static void showSummary() {
        System.out.println("Your meal: ");
        for (Order order : orderList) {
            order.showMeals();
            order.getPrice();
        }
    }


    private static ArrayList<String> fillAList(String filePath){

        String meal = "";
        ArrayList<String> listOfMeal = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            meal = fileReader.readLine();
            do {
                listOfMeal.add(meal);
                meal = fileReader.readLine();
            } while (meal != null);
        } catch (Exception e) {
            System.out.println("Exepction! " + e);
        }

        return listOfMeal;
    }


}
