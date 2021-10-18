package com.stepit.HW8;

public class Premium extends Abonement {


    String name = "fullTime";
    int period = 12;
    double price = 460;

    public void fullTime() {
        System.out.println("You are welcome all opening hours! ");
        System.out.println("You may enjoy our club during " + period + " months plus " + bonus + " bonus month! ");
        System.out.println("The abonement price is " + price);

    }

}