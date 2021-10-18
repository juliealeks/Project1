package com.stepit.Practice6;

public class Duck extends  Bird{
//public class Duck extends Bird implements Swimmable, Flying {
    String color = "grey";
    Double weight = 0.5;
    int beakLength = 7;

//   public void swim(){
//       System.out.println("swimming around");
//    }

    public void sleep() {
        System.out.println("duck sleeps");

    }

    @Override
    void fly() {
        System.out.println("high in the sky");
    }


//    @Override
//    public void swimFast() {
//        System.out.println("swimming fast around");
//    }
//
//    @Override
//    public void flyfast() {
//        System.out.println("fly high");
    }

