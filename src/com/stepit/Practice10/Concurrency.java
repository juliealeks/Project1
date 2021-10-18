package com.stepit.Practice10;

public class Concurrency extends Thread{

    public static int amount = 0;

    public void run(){
        amount++;
    }

    public static void main(String[] args) {
        Concurrency thread = new Concurrency();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
}
