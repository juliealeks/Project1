package com.stepit.HW8;

public class Business extends Abonement{
    String name = "partTime";
    int period = 12;
    double price = 390;

    public void partTime() {
        System.out.println("You are welcome day time or evening time! ");
        System.out.println("You may enjoy our club during " + period + " months! ");
        System.out.println("The abonement price is " + price);

    }
}
