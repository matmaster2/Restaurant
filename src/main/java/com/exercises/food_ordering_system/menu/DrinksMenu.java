package com.exercises.food_ordering_system.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.ClassLoader.getSystemClassLoader;

public class DrinksMenu {

    public void ordering() {
        System.out.println("Do you want alcohol[1] or non-alcohol[2] drink?");
        choice();
    }

    void showMenu(int i) {
        List<String> drinks = new ArrayList<>();
        String filePath;
        switch (i) {
            case 1:
                filePath = "food_ordering_system/foods_and_drinks/drinks/alcohol";

                try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
                    String drink = fileReader.readLine();
                    do {
                        drinks.add(drink);
                        drink = fileReader.readLine();
                    } while (drink != null);
                } catch (Exception e) {
                    System.out.println("Wybuchlo!");
                }

                drinks.forEach(System.out::println);



            case 2:
                filePath = "food_ordering_system/foods_and_drinks/drinks/non_alcohol";
        }
    }

    private void choice() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        try {
            switch (Integer.parseInt(userInput)) {
                case 1:
                    System.out.println("Which alcohol drink do you want?");
                    showMenu(1);
                    break;
                case 2:
                    System.out.println("Which non-alcohol drink do you want?");
                    showMenu(2);
                    break;
                default:
                    System.out.println("Kliknales coś innego!");
                    ordering();
                    break;
            }
        } catch (Exception e) {
            System.out.println("Musisz podać liczbę!");
            ordering();
        }

    }
}
