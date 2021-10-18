package com.stepit.Practice10;

public class ThreadExtend extends Thread {
    public void run() {
        System.out.println("This code is running in a thread");
    }
    public static void main(String[] args) {

        ThreadExtend thread = new ThreadExtend();
        thread.start();
        System.out.println("This code is running of the thread");
    }
}
