package com.exercises.food_ordering_system.tasks;

import com.exercises.food_ordering_system.builder.Order;
import com.exercises.food_ordering_system.builder.OrderBuilder;
import com.exercises.food_ordering_system.builder.menu.Dessert;
import com.exercises.food_ordering_system.builder.menu.Drink;
import com.exercises.food_ordering_system.builder.menu.DrinkAdditive;
import com.exercises.food_ordering_system.builder.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.PolishMainCourse;

import java.util.ArrayList;
import java.util.Scanner;

import static com.exercises.food_ordering_system.utility.fillingListFromFile.fillAList;

public class MakeOrder {

  //  private static ArrayList<Order> orderList = new ArrayList<>();

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
                    mainCourseChoice();
                    break;
                case 2:
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

        System.out.println("What kind of meal do you want?");

        String meal;
        String dessert;

        ArrayList<String> listOfMainCourses = fillAList("food_ordering_system//foods_and_drinks//type_of_main_courses");
        listOfMainCourses.forEach(System.out::println);

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        OrderBuilder orderBuilder;

        try {
            switch (Integer.parseInt(userInput)) {
                case 1:
                    System.out.println("Your choice is Italian Course!");
                    meal = cuisineChoice(ItalianMainCourse.listOfItalianMainCourses);
                    System.out.println("What dessert do you want?");
                    dessert = dessertChoice();

                    orderBuilder = new OrderBuilder();
                    Order orderItalianMainCourse = orderBuilder.orderItalianLunch(meal, dessert);
                   // orderList.add(orderItalianMainCourse);
                    break;
                case 2:
                    System.out.println("Your choice is Mexican Course!");
                    meal = cuisineChoice(MexicanMainCourse.listOfMexicanMainCourses);
                    System.out.println("What dessert do you want?");
                    dessert = dessertChoice();

                    orderBuilder = new OrderBuilder();
                    Order orderMexicanMainCourse = orderBuilder.orderMexicanLunch(meal, dessert);
                  //  orderList.add(orderMexicanMainCourse);
                    break;
                case 3:
                    System.out.println("Your choice is Polish Course!");
                    meal = cuisineChoice(PolishMainCourse.listOfPolishMainCourses);
                    System.out.println("What dessert do you want?");
                    dessert = dessertChoice();


                    orderBuilder = new OrderBuilder();
                    Order orderPolishMainCourse = orderBuilder.orderPolishLunch(meal, dessert);
                 //   orderList.add(orderPolishMainCourse);
                    break;
                default:
                    System.out.println("Kliknales coś innego!");
                    System.exit(0); //todo nie wylaczac aplikacji, czyszczenie
                    break;
            }
        } catch (Exception e) {
            System.out.println("Musisz podać liczbę!");
            System.exit(0);
        }
    }


    private static void drinkChoice() {
        System.out.println("What kind of drink do you want?");
        String drink;
        String drinkAdditive;

        OrderBuilder orderBuilder;

        Drink.listOfDrinks.forEach(System.out::println);
        System.out.println("Write what drink do you want.");
        Scanner sc = new Scanner(System.in);
        drink = sc.nextLine();
        inputCheck(drink, Drink.listOfDrinks);

        orderBuilder = new OrderBuilder();
        Order orderDrink = orderBuilder.orderDrink(drink);
        //orderList.add(orderDrink);

        System.out.println("Do you want drink additive?\nYes[1]\nNo[2]");
        String userInput = sc.nextLine();
        try {
            switch (Integer.parseInt(userInput)) {
                case 1:
                    DrinkAdditive.listOfDrinkAdditives.forEach(System.out::println);
                    System.out.println("Write what drink do you want.");

                    sc = new Scanner(System.in);
                    drinkAdditive = sc.nextLine(); //todo nie wpisywanie z reki, tylko lista z pliku z indexOf
                    inputCheck(drinkAdditive, DrinkAdditive.listOfDrinkAdditives);

                    orderBuilder = new OrderBuilder();

                    Order orderDrinkWithAdditive = orderBuilder.orderDrinkAdditive(drinkAdditive);
              //      orderList.add(orderDrinkWithAdditive);
                    break;
                case 2:
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

    private static String dessertChoice() {
        Dessert.listOfDesserts.forEach(System.out::println);

        Scanner sc = new Scanner(System.in);
        String dessert = sc.nextLine();

        inputCheck(dessert, Dessert.listOfDesserts);

        return dessert;
    }

    private static String cuisineChoice(ArrayList<String> listOfMeals) {
        System.out.println("Menu:");
        listOfMeals.forEach(System.out::println);
        System.out.println("Write what meal do you want.");

        Scanner sc = new Scanner(System.in);
        String meal = sc.nextLine();

        inputCheck(meal, listOfMeals);

        return meal;

    }


    private static void showSummary() {
        System.out.println("Your meal: ");
        //for (Order order : orderList) {
        //    order.showMeals();
        //    order.getPrice();
       // }
        Order.showMeals();
    }


    private static void inputCheck(String input, ArrayList<String> list) { //todo do usuniecia

        boolean check = false;

        for (String item : list) {
            if (item.contains(input)) {
                check = true;
            }


        if (check == false) {
            System.out.println("This position isn't exist on menu. Try again!");
            System.exit(0);
        }
    }
}
}
