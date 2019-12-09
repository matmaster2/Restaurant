package com.exercises.country_city_building;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercises 1:\n" +
                "Select countries where the total number of inhabitants (population) in all cities is greaterthan 400:");
        System.out.println("Answer:\n" +
                "Select XF.Country.Name From XF.Country RIGHT JOIN XF.City ON [PK CountryID] = [FK CountryID]  GROUP BY XF.Country.Name HAVING SUM(XF.City.Population)>400");
        System.out.println("Exercises 2: \n" +
                "Select names of the countries that have no buildings at all");
        System.out.println("Answer:\n" +
                "Select XF.Country.Name From XF.Country FULL OUTER JOIN XF.City ON [PK CountryID] = [FK CountryID] FULL OUTER JOIN XF.Building ON [PK CityID] = [FK CityID] GROUP BY XF.Country.Name HAVING COUNT(XF.Building.[PK BuildingID]) = 0");


    }

}
