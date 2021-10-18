package com.stepit.Practice8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList <Book> library = new LinkedList<>();

        Book a = new Book("smbd","smth", (short) 1000);
        Book b = new Book("Walter Scott", "Ivanhoe",(short)1900);
        Book c = new Book("Charles Dickens", "Oliver Twist",(short)1887);
        Book d = new Book("Arthur Conan Doyle", "Sherlock Holmes adventures",(short)1930);
        Book e = new Book("Edgar Allan Poe", "Golden bug",(short)1870);
        Book f = new Book("Gulliver's voyage", "smth",(short)2021);

        List<Book> list = Arrays.asList(b, c, d, e, f);

        library.addAll(list);
        library.removeFirstOccurrence(c);
        library.removeLastOccurrence(d);
        library.offerFirst(a);
        library.offerLast(a);

        Iterator<Book> it = library.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
