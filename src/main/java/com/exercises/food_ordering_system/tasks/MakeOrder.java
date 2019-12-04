package com.exercises.food_ordering_system.tasks;

import com.exercises.food_ordering_system.builder.Order;
import com.exercises.food_ordering_system.builder.OrderBuilder;
import com.exercises.food_ordering_system.builder.menu.Dessert;
import com.exercises.food_ordering_system.builder.menu.Drink;
import com.exercises.food_ordering_system.builder.menu.DrinkAdditive;
import com.exercises.food_ordering_system.builder.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.builder.menu.main_courses.PolishMainCourse;
import com.exercises.food_ordering_system.data.FileDataProvider;
import com.exercises.food_ordering_system.data.IDataProvider;

import java.util.ArrayList;
import java.util.Scanner;

import static com.exercises.food_ordering_system.utility.fillingListFromFile.fillAList;

public class MakeOrder {

    private IDataProvider dataProvider = new FileDataProvider();

    public void startOrdering() {
        System.out.println("INSTRUCTION: For navigation, please press the buttons written in square brackets []\n");
        System.out.println("What do you want - lunch[1] or drink[2] or both of them?[3]");
        orderChoice();
        showSummary();
    }


    private void orderChoice() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        try {
            switch (Integer.parseInt(userInput)) {
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
                    System.out.println("Kliknales coś innego!");
                    startOrdering();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Musisz podać liczbę!");
            startOrdering();
        }
    }

    private void cuisineChoice() {
        System.out.println("What kind of meal do you want?");

        ArrayList<String> listOfMainCourses = fillAList("food_ordering_system//foods_and_drinks//type_of_main_courses");
        listOfMainCourses.forEach(System.out::println);

        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();

        try {
            switch (Integer.parseInt(userInput)) {
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
                    System.out.println("Kliknales coś innego!");
                    startOrdering();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Musisz podać liczbę!");
            startOrdering();
        }
    }


    private void italianMainCourseChoice() {

        ItalianMainCourse italianMainCourse = null;

        ArrayList<ItalianMainCourse> listOfItalianMainCourses = dataProvider.getItalianMainCourse();

        System.out.println("What kind of Italian main course do you want?");
        int choice;

        OrderBuilder orderBuilder;

        for (int i = 0; i < listOfItalianMainCourses.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfItalianMainCourses.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        if (choice > 0 && choice < listOfItalianMainCourses.size()) {
            italianMainCourse = listOfItalianMainCourses.get(choice - 1);
        }

        orderBuilder = new OrderBuilder();
        Order orderItalianMainCourse = orderBuilder.orderItalianMainCourse(italianMainCourse);

    }

    private void mexicanMainCourseChoice() {
        MexicanMainCourse mexicanMainCourse = null;

        ArrayList<MexicanMainCourse> listOfMexicanMainCourses = dataProvider.getMexicanMainCourse();

        System.out.println("What kind of Mexican main course do you want?");
        int choice;

        OrderBuilder orderBuilder;

        for (int i = 0; i < listOfMexicanMainCourses.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfMexicanMainCourses.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        if (choice > 0 && choice < listOfMexicanMainCourses.size()) {
            mexicanMainCourse = listOfMexicanMainCourses.get(choice - 1);
        }

        orderBuilder = new OrderBuilder();
        Order orderMexicanMainCourse = orderBuilder.orderMexicanMainCourse(mexicanMainCourse);
    }

    private void polishMainCourseChoice() {
        PolishMainCourse polishMainCourse = null;

        ArrayList<PolishMainCourse> listOfPolishMainCourses = dataProvider.getPolishMainCourse();

        System.out.println("What kind of Polish main course do you want?");
        int choice;

        OrderBuilder orderBuilder;

        for (int i = 0; i < listOfPolishMainCourses.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfPolishMainCourses.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        if (choice > 0 && choice < listOfPolishMainCourses.size()) {
            polishMainCourse = listOfPolishMainCourses.get(choice - 1);
        }

        orderBuilder = new OrderBuilder();
        Order orderPolishMainCourse = orderBuilder.orderPolishMainCourse(polishMainCourse);
    }


    private void drinkChoice() {

        Drink drink = null;

        ArrayList<Drink> listOfDrinks = dataProvider.getDrinks();

        System.out.println("What kind of drink do you want?");
        int choice;

        OrderBuilder orderBuilder;

        for (int i = 0; i < listOfDrinks.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfDrinks.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        if (choice > 0 && choice < listOfDrinks.size()) {
            drink = listOfDrinks.get(choice - 1);
        }

        orderBuilder = new OrderBuilder();
        Order orderDrink = orderBuilder.orderDrink(drink);

    }

    private void drinkAdditiveChoice() {
        DrinkAdditive drinkAdditive = null;

        ArrayList<DrinkAdditive> listOfDrinkAdditives = dataProvider.getDrinkAdditive();

        System.out.println("What kind of drink do you want?");
        int choice;

        OrderBuilder orderBuilder;

        for (int i = 0; i < listOfDrinkAdditives.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfDrinkAdditives.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        if (choice > 0 && choice < listOfDrinkAdditives.size()) {
            drinkAdditive = listOfDrinkAdditives.get(choice - 1);
        }

        orderBuilder = new OrderBuilder();
        Order orderDrink = orderBuilder.orderDrinkAdditive(drinkAdditive);
    }


    private void dessertChoice() {

        Dessert dessert = null;

        ArrayList<Dessert> listOfDesserts = dataProvider.getDessert();

        System.out.println("What kind of dessert do you want?");
        int choice;

        OrderBuilder orderBuilder;

        for (int i = 0; i < listOfDesserts.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + listOfDesserts.get(i).toString());
        }

        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        if (choice > 0 && choice < listOfDesserts.size()) {
            dessert = listOfDesserts.get(choice - 1);
        }

        orderBuilder = new OrderBuilder();
        Order orderDessert = orderBuilder.orderDessert(dessert);

    }


    private static void showSummary() {
        System.out.println("Your meal: ");
        //for (Order order : orderList) {
        //    order.showMeals();
        //    order.getPrice();
        // }
        Order.showMeals();
        //  Order.getPrice();
    }

}


/*


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
                    Order orderItalianMainCourse = orderBuilder.orderItalianMainCourse(meal, dessert);
                    // orderList.add(orderItalianMainCourse);
                    break;
                case 2:
                    System.out.println("Your choice is Mexican Course!");
                    meal = cuisineChoice(MexicanMainCourse.listOfMexicanMainCourses);
                    System.out.println("What dessert do you want?");
                    dessert = dessertChoice();

                    orderBuilder = new OrderBuilder();
                    Order orderMexicanMainCourse = orderBuilder.orderMexicanMainCourse(meal, dessert);
                    //  orderList.add(orderMexicanMainCourse);
                    break;
                case 3:
                    System.out.println("Your choice is Polish Course!");
                    meal = cuisineChoice(PolishMainCourse.listOfPolishMainCourses);
                    System.out.println("What dessert do you want?");
                    dessert = dessertChoice();


                    orderBuilder = new OrderBuilder();
                    Order orderPolishMainCourse = orderBuilder.orderPolishMainCourse(meal, dessert);
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

        listOfDrinks.forEach(System.out::println);
        System.out.println("Write what drink do you want.");
        Scanner sc = new Scanner(System.in);
        drink = sc.nextLine();
        inputCheck(drink, listOfDrinks);

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
                    drinkAdditive = sc.nextLine();
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
 */
