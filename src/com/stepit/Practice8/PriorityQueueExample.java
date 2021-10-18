package com.stepit.Practice8;

import java.util.*;

public class PriorityQueueExample {

    public static void main(String[] args) {

        Queue <Book> library = new PriorityQueue<>();

        Book a = new Book("smbd","smth", (short) 1000);
        Book b = new Book("Walter Scott", "Ivanhoe",(short)1900);
        Book c = new Book("Charles Dickens", "Oliver Twist",(short)1887);
        Book d = new Book("Arthur Conan Doyle", "Sherlock Holmes adventures",(short)1930);
        Book e = new Book("Edgar Allan Poe", "Golden bug",(short)1870);
        Book f = new Book("Gulliver's voyage", "smth",(short)2021);
        Book j = new Book("Gullivers voyage", "smth",(short)2021);

        List<Book> list = Arrays.asList(b, b, b, c, d, e, f, j);
       // library.addAll(list);

        Iterator<Book> it = library.iterator();

//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
