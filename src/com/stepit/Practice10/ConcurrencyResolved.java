package com.stepit.Practice10;

public class ConcurrencyResolved {
    public static int amount = 0;

    public void run() {
        amount++;
    }

    public static void main(String[] args) {
        Concurrency thread = new Concurrency();
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }

        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
}