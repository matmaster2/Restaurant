package food_ordering_system.data;

import food_ordering_system.model.Meal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.ClassLoader.getSystemClassLoader;

public class FileDataProvider implements IDataProvider {

    @Override
    public ArrayList<Meal> getDrinks() {
        String filePath = "food_ordering_system//foods_and_drinks//drinks//drinks";
        return getMeal(filePath);
    }

    @Override
    public ArrayList<Meal> getDrinkAdditive() {
        String filePath = "food_ordering_system//foods_and_drinks//drinks//drink_additives";
        return getMeal(filePath);
    }

    @Override
    public ArrayList<Meal> getDessert() {
        String filePath = "food_ordering_system//foods_and_drinks//lunch//desserts//desserts";
        return getMeal(filePath);
    }

    @Override
    public ArrayList<Meal> getItalianMainCourse() {
        String filePath = "food_ordering_system//foods_and_drinks//lunch//main_courses//italian//italian_main_courses";
        return getMeal(filePath);
    }

    @Override
    public ArrayList<Meal> getMexicanMainCourse() {
        String filePath = "food_ordering_system//foods_and_drinks//lunch//main_courses//mexican//mexican_main_courses";
        return getMeal(filePath);
    }

    @Override
    public ArrayList<Meal> getPolishMainCourse() {
        String filePath = "food_ordering_system//foods_and_drinks//lunch//main_courses//polish//polish_main_courses";
        return getMeal(filePath);
    }

    private ArrayList<Meal> getMeal(String filePath) {
        ArrayList<Meal> listOfItems = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(getSystemClassLoader().getResourceAsStream(String.valueOf(filePath))))) {
            String item = fileReader.readLine();
            do {
                String mealName = item.substring(0, item.indexOf('-')).trim();
                double mealPrice = Double.parseDouble(item.substring(item.indexOf('-') + 1).trim());
                Meal meal = new Meal(mealName, mealPrice);
                listOfItems.add(meal);
                item = fileReader.readLine();
            } while (item != null);
        } catch (Exception e) {
            System.out.println("Exception! " + e);
        }
        return listOfItems;
    }

}
