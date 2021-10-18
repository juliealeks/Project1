package com.stepit.Practice7;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
   //     System.out.println(cars);

        List<String> carList = Arrays.asList("Renault","Audi","Alfa Romeo");
        cars.addAll(carList);
     //   System.out.println(cars);
        Collections.sort(cars);
        System.out.println(cars);

//        cars.get(0);
//       System.out.println(cars.get(0));
//        cars.set(0, "Opel");
//     //   System.out.println(cars);
//
//        cars.remove(0);
//        cars.remove("Audi");
//        System.out.println(cars.get(0));
//        System.out.println(cars.size());
//
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(i + 1 + " " + cars.get(i) + " ");
//        }
//        for (String i : cars) {
//            System.out.println(i);
//        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(100);
        myNumbers.add(98798);
        myNumbers.add(-5);
        myNumbers.add(0);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
        Collections.reverse(myNumbers);
        System.out.println(myNumbers);

        LinkedList<String> cars2 = new LinkedList<>();
        cars2.add("KIA");
        cars2.add("Dacia");
        cars2.add("Porsche");
        System.out.println(cars2);
        cars2.addAll(carList);
        cars2.addFirst("RollsRoyce");
        cars2.addLast("Track");
        System.out.println(cars2);
        cars2.removeFirst();
        System.out.println(cars2);
        cars2.removeLast();
        System.out.println(cars2);
        cars2.remove(3);
        System.out.println(cars2);
        cars2.getFirst();
        cars2.getLast();
        System.out.println(cars2);
        System.out.println(cars2.getFirst());
       System.out.println(cars2.getLast());


//        LocalDate myObj = LocalDate.now();
//        System.out.println(myObj);
//
//        LocalDate myObj2 = LocalDate.now();
//        System.out.println(myObj2);
//
//        LocalDate myObj3 = LocalDate.now();
//        System.out.println(myObj3);
//
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        System.out.println(myFormatObj);
//
//        Locale myObj4 = Locale.getDefault();
//        System.out.println(myObj4);
//        enum Level {
//            LOW,
//            MEDIUM,
//            HIGH
//        }
//        Level myVar = Level.MEDIUM;
//        System.out.println(myVar);
//
//        switch (myVar) {
//            case LOW -> System.out.println("Low level ");
//            case MEDIUM -> System.out.println("Medium level ");
//            case HIGH -> System.out.println("High level ");
//        }
//for (Level l:Level.values()) {
//    System.out.println(l);
//}
//
//        enum DaysOfWeek {
//            MONDAY,
//            TUESDAY,
//            WEDNESDAY,
//            THURSDAY,
//            FRIDAY,
//            SATURDAY,
//            SUNDAY
//        }
//        for (DaysOfWeek day : DaysOfWeek.values()) {
//            System.out.println(day);
//        }
    }
}
















