package com.stepit.Practice6;

abstract class Bird {
    String color;
    Double weight;
    int beakLength;

    public void sleep() {
        System.out.println("zzz");
    }

    public void eat() {
        System.out.println("hm");
    }

   abstract void fly()  ;
}