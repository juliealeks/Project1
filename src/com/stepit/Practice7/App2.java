package com.stepit.Practice7;

import java.util.HashMap;
import java.util.HashSet;

public class App2 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
       // HashSet<Animal> animals = new HashSet<Animal>();
        capitalCities.put("England", "london");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("France", "Paris");
        capitalCities.put("Norway", "Oslo");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("France");
        System.out.println(capitalCities);
        //   capitalCities.clear();
        System.out.println(capitalCities.size());
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
//        people.put("Mary",25);
//        people.put("Ann",18);
//        people.put("George",30);
//        people.put("Nick",20);
        HashSet<Animal> animals = new HashSet<Animal>();
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal bird= new Animal("bird");
        animals.add(cat);
        animals.add(dog);
        animals.add(bird);
        System.out.println(animals);

    }
}