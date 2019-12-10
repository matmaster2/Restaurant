package com.exercises.food_ordering_system.tasks;

import com.exercises.food_ordering_system.data.FileDataProvider;
import com.exercises.food_ordering_system.data.IDataProvider;
import com.exercises.food_ordering_system.model.Meal;
import com.exercises.food_ordering_system.model.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {

    private IDataProvider dataProvider = new FileDataProvider();
    private Order order = new Order();

    private static void showSummary() {
        System.out.println("Your meal: ");
        Order.showWholeOrder();
        Order.showTotalPrice();
    }

    public void startOrdering() {
        System.out.println("INSTRUCTION: For navigation, please press the number button written in square brackets [] and press enter\n");
        System.out.println("What do you want - lunch[1] or drink[2] or both of them?[3]");
        orderChoice();
        showSummary();
    }

    private void orderChoice() {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        cuisineChoice();
                        dessertChoice();
                        break;
                    case 2:
                        drinkChoice();
                        break;
                    case 3:
                        cuisineChoice();
                        dessertChoice();
                        drinkChoice();
                        break;
                    default:
                        System.out.println("You press wrong button!");
                        choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
                choice = 0;
            }
        } while (choice == 0);
    }

    private void cuisineChoice() {
        int choice;
        System.out.println("What kind of meal do you want?\nItalian [1]\nMexican [2]\nPolish [3]");

        Scanner sc = new Scanner(System.in);
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        italianMainCourseChoice();
                        break;
                    case 2:
                        mexicanMainCourseChoice();
                        break;
                    case 3:
                        polishMainCourseChoice();
                        break;
                    default:
                        System.out.println("You press wrong button!");
                        choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
                choice = 0;
            }
        } while (choice == 0);
    }

    private void italianMainCourseChoice() {
        Meal italianMainCourse;
        ArrayList<Meal> listOfItalianMainCourses = dataProvider.getItalianMainCourse();
        System.out.println("What kind of Italian main course do you want?");
        italianMainCourse = mealChoice(listOfItalianMainCourses);
        order.addMeal(italianMainCourse);
    }

    private void mexicanMainCourseChoice() {
        Meal mexicanMainCourse;
        ArrayList<Meal> listOfMexicanMainCourses = dataProvider.getMexicanMainCourse();
        System.out.println("What kind of Mexican main course do you want?");
        mexicanMainCourse = mealChoice(listOfMexicanMainCourses);
        order.addMeal(mexicanMainCourse);
    }

    private void polishMainCourseChoice() {
        Meal polishMainCourse;
        ArrayList<Meal> listOfPolishMainCourses = dataProvider.getPolishMainCourse();
        System.out.println("What kind of Polish main course do you want?");
        polishMainCourse = mealChoice(listOfPolishMainCourses);
        order.addMeal(polishMainCourse);
    }

    private void dessertChoice() {
        Meal dessert;
        ArrayList<Meal> listOfDesserts = dataProvider.getDessert();
        System.out.println("What kind of dessert do you want?");
        dessert = mealChoice(listOfDesserts);
        order.addMeal(dessert);
    }

    private void drinkChoice() {
        Meal drink;
        ArrayList<Meal> listOfDrinks = dataProvider.getDrinks();
        System.out.println("What kind of drink do you want?");
        drink = mealChoice(listOfDrinks);
        order.addMeal(drink);
        askAboutDrinkAdditive();
    }

    private void drinkAdditiveChoice() {
        Meal drinkAdditive;
        ArrayList<Meal> listOfDrinkAdditives = dataProvider.getDrinkAdditive();
        System.out.println("What kind of drink additive do you want?");
        drinkAdditive = mealChoice(listOfDrinkAdditives);
        order.addMeal(drinkAdditive);
    }

    private void askAboutDrinkAdditive() {
        int choice = 0;
        System.out.println("Do you want drink additive?\n[1] Yes\n[2] No");
        Scanner sc = new Scanner(System.in);
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice == 1) {
                    drinkAdditiveChoice();
                    break;
                } else if (choice == 2) {
                    break;
                } else {
                    System.out.println("You press wrong number! Press [1] or [2]!");
                }
            } catch (Exception e) {
                System.out.println("You press wrong button! Press [1] or [2]!");
            }
        } while (choice != 1 || choice != 2);
    }

    private Meal mealChoice(ArrayList<Meal> mealList) {
        int choice;
        Meal meal = null;
        showMealList(mealList);
        Scanner sc = new Scanner(System.in);
        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 0 && choice <= mealList.size()) {
                    meal = mealList.get(choice - 1);
                } else {
                    System.out.println("You press wrong button!");
                    choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
                choice = 0;
            }
        } while (choice == 0);
        return meal;
    }

    private void showMealList(ArrayList<Meal> mealList) {
        for (int i = 0; i < mealList.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + mealList.get(i).toString());
        }
    }
}

