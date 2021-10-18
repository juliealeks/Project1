package com.stepit.Practice8;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) throws IllegalAccessException {

        HashMap <Integer,Book> library = new HashMap<>();

        Book a = new Book("smbd","smth", (short) 1000);
        Book b = new Book("Walter Scott", "Ivanhoe",(short)1900);
        Book c = new Book("Charles Dickens", "Oliver Twist",(short)1887);
        Book d = new Book("Arthur Conan Doyle", "Sherlock Holmes adventures",(short)1930);
        Book e = new Book("Edgar Allan Poe", "Golden bug",(short)1870);
        Book f = new Book("Gulliver's voyage", "smth",(short)2021);


        library.put(1,a);

        List<Book> list = Arrays.asList(b, c, d, e, f);

        library = (HashMap<Integer, Book>) convertListToMap(list);

        for (Integer i: library.keySet()) {
            System.out.println("key: " + i + " value: " + library.get(i));
        }

    }
    public static Map <Integer,Book> convertListToMap (List<Book>library) throws IllegalAccessException {
        Map<Integer,Book> map = new HashMap<>();
        for ( int i = 0; i < library.size(); i++) {
            if (map.put(i,library.get(i)) != null) {
                throw new IllegalAccessException("Duplicate key");
            }
        }
        return map;
    }
}
