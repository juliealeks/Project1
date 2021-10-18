package com.stepit.Practice8;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();

        Book a = new Book("smbd","smth", (short) 1000 ,1500);
        Book b = new Book("Walter Scott", "Ivanhoe",(short)1900,780);
        Book c = new Book("Charles Dickens", "Oliver Twist",(short)1887);
        Book d = new Book("Arthur Conan Doyle", "Sherlock Holmes adventures",(short)1930,1250);
        Book e = new Book("Edgar Allan Poe", "Golden bug",(short)1870);
        Book f = new Book("Gulliver's voyage", "smth",(short)2021);

        List<Book> list = Arrays.asList(a, c, d, e, f);

        library.add(b);
//        System.out.println(library);
//        System.out.println(library.get(0));
//        System.out.println(library.size());


        library.addAll(list);
//        System.out.println(library);
//        library.remove(c);
//        System.out.println(library);
//        library.remove(3);
//        System.out.println(library);
//        System.out.println(library.contains(a));
//        System.out.println(library.containsAll(list));
//
//        Iterator <Book> it = library.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        Comparator<Book> nameComparator = Comparator.comparing(Book::getName);
        library.sort(nameComparator);
        System.out.println("sorted by name");
        displayCollection(library);
        Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
        library.sort(authorComparator);
        System.out.println("sorted by author");
        displayCollection(library);
        Comparator<Book> lengthComparator = Comparator.comparing(Book::getNumPages);
        library.sort(lengthComparator);
        System.out.println("sorted by length");
        displayCollection(library);
        Comparator<Book> ageComparator = Comparator.comparing(Book::getAge);
        library.sort(ageComparator);
        System.out.println("sorted by age");
        displayCollection(library);
    }
    public static void displayCollection (ArrayList<Book> library) {

        for (Book book : library) {
            System.out.println(book);
        }
    }
}
