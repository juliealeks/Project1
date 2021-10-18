package com.stepit.Practice10;

public class ThreadImplement  implements Runnable{
    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) {
        ThreadImplement obj = new ThreadImplement();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is running outside of a thread");
    }
}
