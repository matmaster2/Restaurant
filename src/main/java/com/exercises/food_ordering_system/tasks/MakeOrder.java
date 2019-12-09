package com.exercises.food_ordering_system.tasks;

import com.exercises.food_ordering_system.meals.Order;
import com.exercises.food_ordering_system.meals.menu.Dessert;
import com.exercises.food_ordering_system.meals.menu.Drink;
import com.exercises.food_ordering_system.meals.menu.DrinkAdditive;
import com.exercises.food_ordering_system.meals.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.meals.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.meals.menu.main_courses.PolishMainCourse;
import com.exercises.food_ordering_system.data.FileDataProvider;
import com.exercises.food_ordering_system.data.IDataProvider;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeOrder {

    private IDataProvider dataProvider = new FileDataProvider();
    private Order order = new Order();

    public void startOrdering() {
        System.out.println("INSTRUCTION: For navigation, please press the number button written in square brackets [] and press enter\n");
        System.out.println("What do you want - lunch[1] or drink[2] or both of them?[3]");
        orderChoice();
        showSummary();
    }

    private void orderChoice() {
        int choice = 0;
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
        int choice = 0;
        System.out.println("What kind of meal do you want?\nItalian [1]\nPolish [2]\nMexican [3]");

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
        int choice = 0;
        ItalianMainCourse italianMainCourse = null;
        ArrayList<ItalianMainCourse> listOfItalianMainCourses = dataProvider.getItalianMainCourse();

        System.out.println("What kind of Italian main course do you want?");

        for (int i = 0; i < listOfItalianMainCourses.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfItalianMainCourses.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);

        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 0 && choice <= listOfItalianMainCourses.size()) {
                    italianMainCourse = listOfItalianMainCourses.get(choice - 1);
                } else {
                    System.out.println("You press wrong button!");
                    choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
                break;
            }
        } while (choice == 0);

        order.addMeal(italianMainCourse);
    }

    private void mexicanMainCourseChoice() {
        int choice = 0;
        MexicanMainCourse mexicanMainCourse = null;
        ArrayList<MexicanMainCourse> listOfMexicanMainCourses = dataProvider.getMexicanMainCourse();

        System.out.println("What kind of Mexican main course do you want?");

        for (int i = 0; i < listOfMexicanMainCourses.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfMexicanMainCourses.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);

        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 0 && choice <= listOfMexicanMainCourses.size()) {
                    mexicanMainCourse = listOfMexicanMainCourses.get(choice - 1);
                } else {
                    System.out.println("You press wrong button!");
                    choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
            }
        } while (choice == 0);

        order.addMeal(mexicanMainCourse);
    }

    private void polishMainCourseChoice() {
        int choice = 0;
        PolishMainCourse polishMainCourse = null;
        ArrayList<PolishMainCourse> listOfPolishMainCourses = dataProvider.getPolishMainCourse();

        System.out.println("What kind of Polish main course do you want?");

        for (int i = 0; i < listOfPolishMainCourses.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfPolishMainCourses.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);

        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 0 && choice <= listOfPolishMainCourses.size()) {
                    polishMainCourse = listOfPolishMainCourses.get(choice - 1);
                } else {
                    System.out.println("You press wrong button!");
                    choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
            }
        } while (choice == 0);

        order.addMeal(polishMainCourse);
    }

    private void drinkChoice() {
        int choice = 0;
        Drink drink = null;

        ArrayList<Drink> listOfDrinks = dataProvider.getDrinks();

        System.out.println("What kind of drink do you want?");

        for (int i = 0; i < listOfDrinks.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfDrinks.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);

        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 0 && choice <= listOfDrinks.size()) {
                    drink = listOfDrinks.get(choice - 1);
                } else {
                    System.out.println("You press wrong button!");
                    choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
            }
        } while (choice == 0);

        order.addMeal(drink);

        System.out.println("Do you want drink additive?\n[1] Yes\n[2] No");
        choice = 0;
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
        } while (choice != 1 | choice != 2);
    }

    private void drinkAdditiveChoice() {
        int choice = 0;
        DrinkAdditive drinkAdditive = null;
        ArrayList<DrinkAdditive> listOfDrinkAdditives = dataProvider.getDrinkAdditive();

        System.out.println("What kind of drink additive do you want?");

        for (int i = 0; i < listOfDrinkAdditives.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfDrinkAdditives.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);

        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 0 && choice <= listOfDrinkAdditives.size()) {
                    drinkAdditive = listOfDrinkAdditives.get(choice - 1);
                } else {
                    System.out.println("You press wrong button!");
                    choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
            }
        } while (choice == 0);

        order.addMeal(drinkAdditive);
    }

    private void dessertChoice() {
        int choice = 0;
        Dessert dessert = null;
        ArrayList<Dessert> listOfDesserts = dataProvider.getDessert();

        System.out.println("What kind of dessert do you want?");

        for (int i = 0; i < listOfDesserts.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfDesserts.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);

        do {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice > 0 && choice <= listOfDesserts.size()) {
                    dessert = listOfDesserts.get(choice - 1);
                } else {
                    System.out.println("You press wrong button!");
                    choice = 0;
                }
            } catch (Exception e) {
                System.out.println("You must enter a number!");
            }
        } while (choice == 0);

        order.addMeal(dessert);

    }

    private static void showSummary() {
        System.out.println("Your meal: ");
        Order.showWholeOrder();
        Order.showTotalPrice();
    }
}

