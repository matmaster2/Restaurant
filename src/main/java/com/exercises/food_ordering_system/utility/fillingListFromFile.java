package com.exercises.food_ordering_system.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.ClassLoader.getSystemClassLoader;

public class fillingListFromFile {

    public static ArrayList<String> fillAList(String filePath) {
        String item = "";
        ArrayList<String> listOfItems = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            item = fileReader.readLine();
            do {
                listOfItems.add(item);
                item = fileReader.readLine();
            } while (item != null);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        }

        return listOfItems;
    }


}
