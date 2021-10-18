package com.stepit.Practice8;

import java.time.Year;
import java.util.Objects;

public class Book { //implements Comparable {

    int numPages;
    String author;
    String name;
    short yearOfPublication;
    String publishingHouse;
    boolean isTranslated;



//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }

    enum Genre {
        DETECTIVE,
        SCIENCE,
        FANTASY,
        ROMANCE,
        HORROR,
        CLASSIC,
        HISTORICAL
    }

    public Book(String name)   {
        this.name = name;
    }

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    public Book(String author, String name, short yearOfPublication) {
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }
    public Book(String author, String name, short yearOfPublication, int numPages) {
        this.numPages = numPages;
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    public Book(int numPages, String author, String name, short yearOfPublication, String publishingHouse, boolean isTranslated) {
        this.numPages = numPages;
        this.author = author;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.publishingHouse = publishingHouse;
        this.isTranslated = isTranslated;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(short yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public boolean isTranslated() {
        return isTranslated;
    }

    public void setTranslated(boolean translated) {
        isTranslated = translated;
    }

    public int getAge() {
        return Year.now().getValue() - (int)yearOfPublication;
    }
    @Override
    public String toString() {
        return "Book{" +
                "numPages=" + numPages +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", isTranslated=" + isTranslated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name);
    }
}

