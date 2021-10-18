package com.stepit.HW8;

public class Economy extends Abonement{
    String name = "eveningTime";
    int period = 10;
    double price = 260;

    public void eveningTime() {
        System.out.println("You are welcome evening time! ");
        System.out.println("You may enjoy our club during " + period + " months plus " + bonus + " bonus month! ");
        System.out.println("The abonement price is " + price);

    }
    }

