package com.exercises.food_ordering_system.data;

import com.exercises.food_ordering_system.meals.menu.Dessert;
import com.exercises.food_ordering_system.meals.menu.Drink;
import com.exercises.food_ordering_system.meals.menu.DrinkAdditive;
import com.exercises.food_ordering_system.meals.menu.main_courses.ItalianMainCourse;
import com.exercises.food_ordering_system.meals.menu.main_courses.MexicanMainCourse;
import com.exercises.food_ordering_system.meals.menu.main_courses.PolishMainCourse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.ClassLoader.getSystemClassLoader;

public class FileDataProvider implements IDataProvider {

    @Override
    public ArrayList<Drink> getDrinks() {
        String filePath = "food_ordering_system//foods_and_drinks//drinks//drinks";
        ArrayList<Drink> listOfItems = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            String item = fileReader.readLine();
            do {
                String drinkName = item.substring(0, item.indexOf("-")).trim();
                double drinkPrice = Double.valueOf(item.substring(item.indexOf("-") + 1).trim());
                Drink drink = new Drink(drinkName, drinkPrice);
                listOfItems.add(drink);
                item = fileReader.readLine();
            } while (item != null);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        }
        return listOfItems;
    }

    @Override
    public ArrayList<DrinkAdditive> getDrinkAdditive() {
        String filePath = "food_ordering_system//foods_and_drinks//drinks//drink_additives";
        ArrayList<DrinkAdditive> listOfItems = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            String item = fileReader.readLine();
            do {
                String drinkAdditiveName = item.substring(0, item.indexOf("-")).trim();
                double drinkAdditivePrice = Double.valueOf(item.substring(item.indexOf("-") + 1).trim());
                DrinkAdditive drinkAdditive = new DrinkAdditive(drinkAdditiveName, drinkAdditivePrice);
                listOfItems.add(drinkAdditive);
                item = fileReader.readLine();
            } while (item != null);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        }
        return listOfItems;
    }

    @Override
    public ArrayList<Dessert> getDessert() {
        String filePath = "food_ordering_system//foods_and_drinks//lunch//desserts//desserts";
        ArrayList<Dessert> listOfItems = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            String item = fileReader.readLine();
            do {
                String dessertName = item.substring(0, item.indexOf("-")).trim();
                double dessertPrice = Double.valueOf(item.substring(item.indexOf("-") + 1).trim());
                Dessert dessert = new Dessert(dessertName, dessertPrice);
                listOfItems.add(dessert);
                item = fileReader.readLine();
            } while (item != null);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        }
        return listOfItems;
    }

    @Override
    public ArrayList<ItalianMainCourse> getItalianMainCourse() {
        String filePath = "food_ordering_system//foods_and_drinks//lunch//main_courses//italian//italian_main_courses";
        ArrayList<ItalianMainCourse> listOfItems = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            String item = fileReader.readLine();
            do {
                String italianMainCourseName = item.substring(0, item.indexOf("-")).trim();
                double italianMainCoursePrice = Double.valueOf(item.substring(item.indexOf("-") + 1).trim());
                ItalianMainCourse italianMainCourse = new ItalianMainCourse(italianMainCourseName, italianMainCoursePrice);
                listOfItems.add(italianMainCourse);
                item = fileReader.readLine();
            } while (item != null);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        }
        return listOfItems;
    }

    @Override
    public ArrayList<MexicanMainCourse> getMexicanMainCourse() {
        String filePath = "food_ordering_system//foods_and_drinks//lunch//main_courses//mexican//mexican_main_courses";
        ArrayList<MexicanMainCourse> listOfItems = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            String item = fileReader.readLine();
            do {
                String mexicanMainCourseName = item.substring(0, item.indexOf("-")).trim();
                double mexicanMainCoursePrice = Double.valueOf(item.substring(item.indexOf("-") + 1).trim());
                MexicanMainCourse mexicanMainCourse = new MexicanMainCourse(mexicanMainCourseName, mexicanMainCoursePrice);
                listOfItems.add(mexicanMainCourse);
                item = fileReader.readLine();
            } while (item != null);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        }
        return listOfItems;
    }

    @Override
    public ArrayList<PolishMainCourse> getPolishMainCourse() {
        String filePath = "food_ordering_system//foods_and_drinks//lunch//main_courses//polish//polish_main_courses";
        ArrayList<PolishMainCourse> listOfItems = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            String item = fileReader.readLine();
            do {
                String polishMainCourseName = item.substring(0, item.indexOf("-")).trim();
                double polishMainCoursePrice = Double.valueOf(item.substring(item.indexOf("-") + 1).trim());
                PolishMainCourse polishMainCourse = new PolishMainCourse(polishMainCourseName, polishMainCoursePrice);
                listOfItems.add(polishMainCourse);
                item = fileReader.readLine();
            } while (item != null);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        }
        return listOfItems;
    }
}
